package com.sk.learn.binarytree;

public class BinaryTree {
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.addNode(1, "Shyju");
		binaryTree.addNode(2, "Noshanth");
		binaryTree.addNode(5, "Naga");
		binaryTree.addNode(3, "Vishin");
		binaryTree.addNode(6, "Anoop");
		binaryTree.addNode(4, "Anoop");
		
		System.out.println("In order traversal");
		binaryTree.inOrderTraverseTree(binaryTree.root);
		
		System.out.println("Pre order traversal");
		binaryTree.preOrderTraverseTree(binaryTree.root);
		
		System.out.println("Size of the tree : "+binaryTree.size(binaryTree.root));
		System.out.println("Height of the tree is : "+binaryTree.height(binaryTree.root));
		
	}
	
	public int height(Node node){
		
		if(node == null){
			return 0;
		}else{
			return 1+ Math.max(height(node.leftChild), height(node.rightChild));
		}
	}
	/**
	 * Method used to find the size of the tree
	 * @param node
	 * @return
	 */
	public int size(Node node){
		if(node == null){
			return 0;
		}else{
			return (size(node.leftChild)+1+size(node.rightChild));
		}
	}
	
	/**
	 * Methos used to traverse in order
	 * @param focusNode
	 */
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
		
	/**
	 * Method used to traverse in pre order
	 * @param focusNode
	 */
	public void preOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	Node root;
	public void addNode(int key, String value){
		Node newNode = new Node(key,value);
		if(root == null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				 parent = focusNode;
				 if(key < focusNode.key){
					 focusNode = focusNode.leftChild;
					 if(focusNode == null){
						 parent.leftChild = newNode; 
						 return;
					 }
				 }else{
					 focusNode = focusNode.rightChild;
					 if(focusNode == null){
						 parent.rightChild = newNode;
						 return;
					 }
				 }
				
			}
			
		}
			
	}
		
	class Node{
		int key;
		String value;
		Node leftChild;
		Node rightChild;
		
		public Node(int key, String value){
			this.key = key;
			this.value = value;
		}
		
		public String toString(){
			return key +" , "+value;
		}
		
	}
	

}
