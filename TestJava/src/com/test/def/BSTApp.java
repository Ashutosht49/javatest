package com.test.def;
class Node{
	int data;
	Node left;
	Node right;
}
class BST{
	public Node createNewNode(int k){
		Node a = new Node();
		a.data=k;
		a.left = null;
		a.right = null;
		return a;
	}
	public Node insert(Node node, int val){
		if(node == null){
			return createNewNode(val);
		}
		if(val<node.data){
			node.left=insert(node.left, val);
		} else if(val>node.data){
			node.right=insert(node.right, val);
		}
		return node;
	}
	public Node delete(Node node, int val){
		if(node == null){
			return null;
		}
		if(val < node.data){
			node.left = delete(node.left, val);
		} else if(val > node.data){
			node.right = delete(node.right, val);
		} else {
			if(node.left == null && node.right == null){
				Node temp = null;
				temp = node.left==null ? node.right :node.left;
				if(temp == null){
					return null;
				} else {
					return temp;
				}
			} else {
				Node sucessor = getSucessor(node);
				node.data = sucessor.data;
				node.right = delete(node.right, sucessor.data);
				return node;
			}
		}
		return node;
	}
	public Node getSucessor(Node node){
		if(node == null){
			return null;
		}
		Node temp = node.right;
		while(temp.left != null){
			temp = temp.left;
		}
		return temp;
	}
}
public class BSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b= new BST();
		Node root = null;
		root = b.insert(root, 8);
		root = b.insert(root, 3);
		root = b.insert(root, 6);
		root = b.insert(root, 9);
		root = b.insert(root, 10);
		root = b.insert(root, 5);
		root = b.insert(root, 2);
		
		root = b.delete(root, 3);
	}

}
