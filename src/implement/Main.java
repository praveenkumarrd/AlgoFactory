package implement;

import Graph.Graph;
import TreeDS.BinarySearchTree;
import TreeDS.Node;

public class Main {

	public static void main(String[] args) {
		
	Graph graph = new Graph();
	graph.setEdges();
	graph.printGraph();
	
	/*
	 * GenBean g= new GenBean();
	//g.checkPermutation("dog", "odg");
	String a = g.stringCompressor("aabccccaaa");
	System.out.println(a);
	 * boolean b = g.checkString_NoDatastructure("Sony");
	if (b){
		System.out.println("It isn't unique...");
	}
	else
		System.out.println("He is a unique snow flake...!!!");*/
	/*BinarySearchTree tree = new BinarySearchTree();
	Node node = new Node();
	node.setData(12);
	tree.insertNode(node);
	System.out.println("Printing tree...!");
	tree.inOrderTreeWalk(tree.getRoot());
	node = new Node();
	node.setData(5);
	tree.insertNode(node);
	node = new Node();
	node.setData(18);
	tree.insertNode(node);
	node = new Node();
	node.setData(2);
	tree.insertNode(node);
	node = new Node();
	node.setData(9);
	tree.insertNode(node);
	node = new Node();
	node.setData(15);
	tree.insertNode(node);
	node = new Node();
	node.setData(19);
	tree.insertNode(node);
	node = new Node();
	node.setData(17);
	tree.insertNode(node);
	node = new Node();
	node.setData(13);
	tree.insertNode(node);
	System.out.println("Printing tree...!");
	tree.inOrderTreeWalk(tree.getRoot());
	node = new Node();
	node.setData(13);
	tree.deleteNode(tree.getRoot(), node);
	tree.inOrderTreeWalk(tree.getRoot());*/
	}
}
