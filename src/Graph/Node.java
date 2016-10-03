package Graph;

import java.util.ArrayList;

public class Node {
	
	private Integer name;
	private ArrayList<Node> edges;
	
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public ArrayList<Node> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Node> edges) {
		this.edges = edges;
	}
}
