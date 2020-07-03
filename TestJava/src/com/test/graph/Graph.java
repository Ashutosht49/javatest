package com.test.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	private HashMap<Node, LinkedList<Node>> adjecentMap;
	private boolean directed;
	Graph(boolean directed){
		this.directed=directed;
		adjecentMap = new HashMap<>();
	}
	public void addEdgeHelper(Node a, Node b){
		LinkedList<Node> tmp= adjecentMap.get(a);
		if(tmp!=null){
			tmp.remove(b);
		} else {
			tmp = new LinkedList<>();
			tmp.add(b);
			adjecentMap.put(a,  tmp);
		}
	}
	public void addEdge(Node source, Node destination){
		if(!adjecentMap.keySet().contains(source)){
			adjecentMap.put(source, null);
		}
		if(!adjecentMap.keySet().contains(destination)){
			adjecentMap.put(destination, null);
		}
		addEdgeHelper(source, destination);
		if(!directed){
			addEdgeHelper(source, destination);
		}
	}
	public void printEdge(){
		for(Node node: adjecentMap.keySet()){
			System.out.print("The "+node.name+" has an Edge towards: ");
			for(Node negibour : adjecentMap.keySet()){
				System.out.print(negibour.name + " ");
			}
			System.out.println();
		}
	}
	public boolean hasEdge(Node source, Node destination){
		return adjecentMap.containsKey(source) && adjecentMap.get(source).contains(destination);
	}
	public void depthFirstSearchModified(Node node) {
	    depthFirstSearch(node);

	    for (Node n : adjecentMap.keySet()) {
	        if (!n.visited()) {
	            depthFirstSearch(n);
	        }
	    }
	}

	public void depthFirstSearch(Node node) {
	    node.visit();
	    System.out.print(node.name + " ");

	    LinkedList<Node> allNeighbors = adjecentMap.get(node);
	        if (allNeighbors == null)
	            return;

	    for (Node neighbor : allNeighbors) {
	        if (!neighbor.visited())
	            depthFirstSearch(neighbor);
	    }
	}
	public static void main(String args[]){
		Graph graph = new Graph(true);
        Node zero = new Node(0, "0");
        Node one = new Node(1, "1");
        Node two = new Node(2, "2");
        Node three = new Node(3, "3");
        Node four = new Node(4, "4");
        Node five = new Node(5, "5");
        Node six = new Node(6, "6");
        Node seven = new Node(7, "7");
        Node eight = new Node(8, "8");

        graph.addEdge(one,zero);
        graph.addEdge(three,one);
        graph.addEdge(two,seven);
        graph.addEdge(two,four);
        graph.addEdge(five,two);
        graph.addEdge(five,zero);
        graph.addEdge(six,five);
        graph.addEdge(six,three);
        graph.addEdge(six,eight);
        graph.addEdge(seven,five);
        graph.addEdge(seven,six);
        graph.addEdge(seven,eight);

        graph.printEdge();
	}
}
