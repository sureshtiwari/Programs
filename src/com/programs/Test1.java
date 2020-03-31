package com.programs;

import java.util.Scanner;

import com.programs.node.Node;

public class Test1 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }
	
	
	public static void preOrder( Node root ) {
	      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }


	public static Node insert(Node root, int data) {

		if (root == null) {
			Node node = new Node(data);
			node.left = null;
			node.right = null;
			root = node;
			return root;
		}
		if (root.data >= data) {
			if (root.left != null)
				insert(root.left, data);
			else {
				Node node = new Node(data);
				node.left = null;
				node.right = null;
				root.left = node;
			}
		} else {
			if (root.right != null)
				insert(root.right, data);
			else {
				Node node = new Node(data);
				node.left = null;
				node.right = null;
				root.right = node;
			}
		}

		return root;
	}

}
