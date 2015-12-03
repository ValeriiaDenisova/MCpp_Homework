
public class BsTreeMain {

	public static void main(String[] args) {
		BsTree tree = new BsTree();
		tree.add(22);
		tree.add(11);
		tree.add(15);
		tree.add(0);
		tree.add(150);
		tree.add(18);
		tree.print();
		System.out.println();
		System.out.println("Size = " + tree.size());
		System.out.println("Nodes = " + tree.nodes());
		System.out.println("Leafs = " + tree.leafs());
		System.out.println("Height = " + tree.height());
		tree.reverse();
	}

}
