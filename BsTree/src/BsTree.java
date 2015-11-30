
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
}