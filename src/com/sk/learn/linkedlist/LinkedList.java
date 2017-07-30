package com.sk.learn.linkedlist;

public class LinkedList {
	
	static Node head = null;
	
	/**
	 * Class represent a node in Linked List
	 */
	static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}
	
	
	/**
	 * Method to append elements in linked list
	 * @param data
	 */
	static void append(int data){
		
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	/**
	 * Method used to remove duplicate from the linked list
	 * @param head
	 */	
	static void distinctElements(Node head){
		Node currentNode = null, nextNode = null;
		currentNode = head;
		while(currentNode != null && currentNode.next != null){
			nextNode = currentNode;
			while(nextNode.next != null){
				if(currentNode.data == nextNode.next.data){
					nextNode.next = nextNode.next.next;
				}else{
					nextNode = nextNode.next;
				}
			}
			currentNode = currentNode.next;
		}
	}
	
	//Method used to print the linked list
	static void print(){
		Node current = head;
		while(current != null){
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	
	
	 static Node left;
	 
	    static boolean isPalindrome(Node head) {
	        left = head;
	 
	        boolean result = helper(head);
	        return result;
	    }
	 
	    static boolean helper(Node right){
	 
	        //stop recursion
	        if (right == null)
	            return true;
	 
	        //if sub-list is not palindrome,  return false
	        boolean x = helper(right.next);
	        if (!x)
	            return false;
	 
	        //current left and right
	        boolean y = (left.data == right.data);
	 
	        //move left to next
	        left = left.next;
	 
	        return y;
	    }
	
	
	public static void main(String[] args) {
		LinkedList.append(10);
		/*LinkedList.append(11);
		LinkedList.append(10);
		LinkedList.append(12);
		LinkedList.append(13);
		LinkedList.append(12);*/
		System.out.println("Linked List with duplicate elements");
		LinkedList.print();
		
		/*System.out.println("Linked List without duplicate elements");
		LinkedList.distinctElements(head);
		LinkedList.print();*/
		
		System.out.println(isPalindrome(head));
	}
	
	
}