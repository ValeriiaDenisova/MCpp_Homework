import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BsTree implements Iterable<Integer> {
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
			if (p.right == null) {
				p.right = new Node(val);
			} else {
				addNode(p.right, val);
			}
		}
	}

	////////////////////////////
	// Size
	///////////////////////////
	public int size() {
		return sizeNode(root);
	}

	private int sizeNode(Node p) {
		if (p == null) {
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
	public int nodes() {
		return nodesNode(root);
	}

	private int nodesNode(Node p) {
		if (p == null) {
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
	public int leafs() {
		return leafsNode(root);
	}

	private int leafsNode(Node p) {
		if (p == null) {
			return 0;
		}
		int ret = 0;
		ret += leafsNode(p.left);
		if (p.left == null && p.right == null)
			ret++;
		ret += leafsNode(p.right);
		return ret;
	}

	////////////////////////////
	// Init
	///////////////////////////
	public void init(int[] ar) {
		if (ar == null || ar.length == 0) {
			ar = new int[0];
		}
		for (int i : ar) {
			add(i);
		}
	}

	////////////////////////////
	// Height
	///////////////////////////
	public int height() {
		return heightNode(root);
	}

	private int heightNode(Node p) {
		if (p == null) {
			return 0;
		}
		int leftSide = leafsNode(p.left);
		int rightSide = leafsNode(p.right);
		return Math.max(leftSide, rightSide) + 1;
	}

	////////////////////////////
	// Clear
	///////////////////////////
	public void clear() {
		root = null;
	}

	////////////////////////////
	// toArray
	///////////////////////////
	
	public int[] toArray() {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null || size() == 0) {

		} else {
			list = toArray(root, list);
		}
		int i = 0;
		int[] arr = new int[list.size()];
		for (int ch : list) {
			arr[i] = ch;
			i++;
		}
		return arr;
	}

	private List<Integer> toArray(Node p, List<Integer> list) {
		if (p == null)
			return list;
		list = toArray(p.left, list);
		list.add(p.val);
		list = toArray(p.right, list);
		return list;
	}
	
	////////////////////////////
	// Reverse
	///////////////////////////
	public void reverse() {
		reverseNode(root);
		}

	private void reverseNode(Node p) {
		if (p == null) {
			return;
		}
	    Node tmp = p.left;
	    p.left = p.right;
	    p.right = tmp;

	    if(p.left != null) reverseNode(p.left);
	    if(p.right != null) reverseNode(p.right);
	}
	
	////////////////////////////
	// Iterator
	///////////////////////////

	@Override
	public Iterator<Integer> iterator() {
		AListItr itr = new AListItr();
		return itr;
	}
	
	class AListItr implements Iterator<Integer>{
		private Node next;

		@Override
		public boolean hasNext() {
			return next != null;
		}

		@Override
		public Integer next() {
			return 0;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
