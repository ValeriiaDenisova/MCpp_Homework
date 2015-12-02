
public class BsTree {
	class Node {
		int val;
		Node left = null;
		Node right = null;

		public Node(int val) {
			this.val = val;
		}
	}

	Node root = null;

	////////////////////////////
	// Print
	///////////////////////////
	
	public void print() {
		printNode(root);
	}

	private void printNode(Node p) {
		if (p == null) {
			return;
		}
		printNode(p.left);
		System.out.print(p.val + ", ");
		printNode(p.right);
	}

	////////////////////////////
	// Add
	///////////////////////////
	
	public void add(int val) {
		if (root == null) {
			root = new Node(val);
			return;
		}
		addNode(root, val);
	}

	private void addNode(Node p, int val) {
		if (val < p.val) {
			if (p.left == null) {
				p.left = new Node(val);
			} else {
				addNode(p.left, val);
			}
		} else {
			if(p.right == null){
				p.right = new Node(val);
			}
			else
			{
				addNode(p.right, val);
			}
		}
	}
	
	////////////////////////////
	// Size
	///////////////////////////
	public int size(){
		return sizeNode(root);
	}
	
	private int sizeNode(Node p){
		if(p == null){
			return 0;
		}
		int ret = 0;
		ret += sizeNode(p.left);
		ret++;
		ret += sizeNode(p.right);
		return ret;
	}
	
	////////////////////////////
	// NodesSize
	///////////////////////////
	public int nodes(){
		return nodesNode(root);
	}
	
	private int nodesNode(Node p){
		if(p == null){
			return 0;
		}
		int ret = 0;
		ret += nodesNode(p.left);
		if (p.left != null && p.right != null)
		ret++;
		ret += nodesNode(p.right);
		return ret;
	}
	
	////////////////////////////
	// LeafsSize
	///////////////////////////
	public int leafs(){
		return leafsNode(root);
	}
	
	private int leafsNode(Node p){
		if(p == null){
			return 0;
		}
		int ret = 0;
		ret += leafsNode(p.left);
		if (p.left == null && p.right == null)
		ret++;
		ret += leafsNode(p.right);
		return ret;
	}
	
}
