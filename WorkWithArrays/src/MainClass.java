
public class MainClass {

	public static void main(String[] args) {
		int res;
		int[] xz;
		int[] arr = { 25, 13, 2, -69, 58, 156, -18, 0 };
		int elem = 777;
		int pos = 3;

		Alist0 rr = new Alist0();

		rr.a = arr;

		xz = rr.print();
		System.out.println("Size = " + rr.size());

		res = rr.fun_min();
		System.out.println("Min = " + res);

		res = rr.fun_min_i();
		System.out.println("Min_I = " + res);

		res = rr.fun_max(arr);
		System.out.println("Max = " + res);

		res = rr.fun_max_i(arr);
		System.out.println("Max_I = " + res);

		xz = rr.bubble();
		System.out.println("Sort: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.revers_massiv();
		System.out.println("Revers: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.half_revers();
		System.out.println("Half Revers: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.set(pos, elem);
		System.out.println("Set " + pos + "element");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		res = rr.get(pos);
		System.out.println("Get " + pos + " element = " + res);

		xz = rr.addFirst(elem);
		System.out.println("Add first: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.addEnd(elem);
		System.out.println("Add end: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.addPos(pos, elem);
		System.out.println("Add element " + elem + " in position" + pos);
		for (int elemen : xz)
			System.out.print(elemen + " ");
		System.out.println();

		xz = rr.clear();
		System.out.println("Clear massiv: ");
		for (int elemen : xz)
			System.out.print(elemen + " ");
	}

}
