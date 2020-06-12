package com.test.algo;

import java.util.LinkedList;
import java.util.Stack;

public class TreeDESWithoutRecursion {
	Node root;
	void inorder(){
		if(root==null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(curr != null || s.size()>0){
			while(curr !=null){
				s.push(curr);
				curr=curr.left;
			}
			curr=s.pop();
			System.out.println(curr.data+" :Inoreder ");
			curr=curr.right;
		}
	}
	public void postOreder(){
		if(root ==null)
			return;
		LinkedList<Node> stack = new LinkedList<Node>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node next = stack.peek();
			Boolean finishedSubTree = (next.right == root || next.left == root );
			Boolean isLeaf = (next.right == null || next.left == null);
			if(finishedSubTree || isLeaf){
				stack.pop();
				System.out.println(next.data+":PostOreder");
				root = next;
			} else {
				if(next.right != null){
					stack.push(next.right);
				}
				if(next.left != null){
					stack.push(next.left);
				}
			}
		}
		
	}
	public void preeOrder(){
		if(root == null)
			return;
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while(st.empty() == false){
			Node myNode = st.peek();
			System.out.println("Data::"+myNode.data);
			st.pop();
			if(myNode.right != null){
				st.push(myNode.right);
			}
			if(myNode.left != null){
				st.push(myNode.left);
			}
		}
	}
	boolean checkBST(){
		return isBSTU(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	boolean isBSTU(Node node, int min, int max){
		if(node == null)
			return true;
		if(root.data< min && root.data > max)
			return false;
		return (isBSTU(node.left, node.left.left.data, node.left.right.data) &&
				isBSTU(node.right, node.right.left.data, node.right.right.data));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeDESWithoutRecursion tree = new TreeDESWithoutRecursion(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder(); 
        tree.postOreder();
        tree.preeOrder();
	}
}
class Node{
	int data;
	Node left, right;
	public Node(int value){
		this.data=value;
		left=right=null;
	}
}
