
public class MainClass {

	public static void main(String[] args) {
		int res;
		int [] xz;
		int [] arr = {25, 13, 2, -69, 58, 156, -18, 0};
		int elem = 777;
		
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
		for(int elemen : xz)
		System.out.print(elemen + " ");
		System.out.println();
		
		xz = rr.revers_massiv();
		System.out.println("Revers: ");
		for(int elemen : xz)
		System.out.print(elemen + " ");
		System.out.println();
			
		xz = rr.half_revers();
		System.out.println("Half Revers: ");
		for(int elemen : xz)
		System.out.print(elemen + " ");
		System.out.println();
		
		xz = rr.addFirst(elem);
		System.out.println("Add first: ");
		for(int elemen : xz)
		System.out.print(elemen + " ");
		System.out.println();
	}

}
