package TreeDS;

public class BinarySearchTree {
	
	private Node root;
	private boolean isBalanced;
	
	public boolean isBalanced() {
		isBalanced = false;
		//checkLeftHeight();
		//checkRightHeight();
		return isBalanced;
	}
	
	private int checkHeight(Node node){
		int lHeight = 0;
		int rHeight = 0;
		while(node.getLeftChild() != null){
			lHeight++;
		}
		while(node.getRightChild() != null){
			rHeight++;
		}
		return Math.max(lHeight, lHeight);
	}
	
	private void setDepth(Node node){
		int depth = 0;
		while(node.getParent() != this.getRoot()){
			depth ++;
		}
		node.setDepth(depth);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void inOrderTreeWalk(Node node){
		if(node == null){
			return;
		}
		else if (!node.isLeaf()){
			inOrderTreeWalk(node.getLeftChild());
			System.out.println(node.getData());
			inOrderTreeWalk(node.getRightChild());
		}
		else{
			System.out.println(node.getData());
		}
	}
	
	public Node searchTree(Node n, int key){
		if(n == null){
			System.out.println("Tree empty...");
			return null;
		}
		else{
			if (key == n.getData()){
				return n;
			}
			if(key > n.getData())
				return searchTree(n.getRightChild(), key);
			else
				return searchTree(n.getLeftChild(), key);
		}
			
	}
	
	public Node findMinimum(Node node){
		while (node.getLeftChild()!= null && !node.getLeftChild().isLeaf()){
			node = node.getLeftChild();
		}
		return node;
	}
	
	public Node findMaximum(Node node){
		while (!node.getRightChild().isLeaf()){
			node = node.getRightChild();
		}
		return node;
	}
	
	public void insertNode(Node toBeInserted){
		if(this.root == null){
			this.root = toBeInserted;
			toBeInserted.setParent(null);
		}
		else if (toBeInserted == this.searchTree(this.root, toBeInserted.getData())){
			System.out.println("The node already exists...!!!");
			return;
		}
		else {
			Node node = decideNode(this.root,toBeInserted);
			if(toBeInserted.getData() < node.getData()){
				node.setLeftChild(toBeInserted);
			}
			else{
				node.setRightChild(toBeInserted);
			}
			toBeInserted.setParent(node);
		}
		toBeInserted.setLeftChild(null);
		toBeInserted.setRightChild(null);
		System.out.println("Node with data "+toBeInserted.getData()+" inserted succesfully!");
	}
	public Node decideNode(Node treeNode,Node insNode){
		Node node = treeNode;
		while(!node.isLeaf()){
			if((insNode.getData() < node.getData())){
				if(node.getLeftChild() == null){
					return node;
				}
				else
					node = node.getLeftChild();
			}
			else{
				if(node.getRightChild() == null){
					return node;
				}
				else
					node = node.getRightChild();
			}
		}
		return node;
	}
	
	public void deleteNode(Node treeNode, Node delNode){
		Node existNode = searchTree(treeNode,delNode.getData());
		if(delNode.getData() == existNode.getData()){
			delNode = existNode;
			if (delNode.isLeaf()){
				System.out.println("Delete node is a leaf");
				if(delNode.getData() < delNode.getParent().getData()){
					delNode.getParent().setLeftChild(null);
				}
				else if(delNode.getData() > delNode.getParent().getData()){
					delNode.getParent().setRightChild(null);
				}
			}
			else if((delNode.getLeftChild() != null) && (delNode.getRightChild() == null)){
				System.out.println("Has Left Child only...");
				delNode.getParent().setRightChild(delNode.getLeftChild());
			}
			else if((delNode.getLeftChild() == null) && (delNode.getRightChild() != null)){
				System.out.println("Has Right Child only...");
				delNode.getParent().setRightChild(delNode.getRightChild());
			}
			else if((delNode.getLeftChild() != null) && (delNode.getRightChild() != null)){
				System.out.println("Has both Left & Right Child...");
				Node copyNode = findMinimum(delNode.getRightChild());
				if(delNode.getParent().getData() < copyNode.getData()){
					delNode.getParent().setRightChild(copyNode);
					copyNode.setRightChild(delNode.getLeftChild());
				}
				else{
					delNode.getParent().setLeftChild(copyNode);
					copyNode.setLeftChild(delNode.getLeftChild());
				}
					
			}
			System.out.println("Node with data "+delNode.getData()+" has been deleted successfully.!");
		}
		else
			System.out.println("Node doesn't exist in tree...!!");
	}
}
