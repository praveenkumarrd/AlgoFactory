package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private ArrayList<Node> nodes;

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	public Graph(){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter number of nodes in Graph");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		this.nodes = new ArrayList<Node>(n);
		if(n>0){
			for(int i=1;i<=n;i++){
				Node node = new Node();
				node.setName(i);
				nodes.add(node);
			}
		}
		System.out.println("Graph with "+n+" nodes created!");
	}
	
	public void setEdges(){
		for (Node i : this.nodes){
			addEdges(i);
		}
	}
	
	public void addEdges(Node i){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of Edges from node "+i.getName());
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		ArrayList<Node> edges = new ArrayList<Node>();
		for (int j=1;j<=n;j++){
			System.out.println("Enter the Node to connect...");
			int k = reader.nextInt();
			boolean nodeExist = false;
			for (Node x : this.getNodes()){
				if (x.getName() == k){
					edges.add(x);
					System.out.println("Node "+x.getName()+" added as an edge");
					nodeExist = true;
				}
			}
			if (!nodeExist){
				System.out.println("The entered Node does'nt exist.!");
			}
		}
		i.setEdges(edges);
	}
	
	
	public void printGraph(){
		System.out.println("\n\nPrinting the Graph!");
		for (Node n : this.getNodes()){
			System.out.println("The Node : "+n.getName());
			System.out.println("The edges : ");
			for(Node e : n.getEdges()){
				System.out.println(e.getName()+"");
			}
		}
	}
	
}
