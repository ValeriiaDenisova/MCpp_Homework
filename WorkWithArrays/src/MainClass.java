
public class MainClass {

	public static void main(String[] args) {
		int res;
		int [] xz;
		int [] arr = {25, 13, 2, -69, 58, 156, -18, 0};
		
		Min_Max_MinI_MaxI min_max = new Min_Max_MinI_MaxI();
		Sort sort = new Sort();
		Revers rev = new Revers();
		
		min_max.arr = arr;
		sort.arr = arr;
		rev.arr = arr;
		
		res = min_max.fun_min(arr);
		System.out.println("Min = " + res);
		
		res = min_max.fun_min_i(arr);
		System.out.println("Min_I = " + res);
		
		res = min_max.fun_max(arr);
		System.out.println("Max = " + res);
		
		res = min_max.fun_max_i(arr);
		System.out.println("Max_I = " + res);

		xz = sort.bubble(arr);
		System.out.println("Sort: ");
		for(int element : xz)
		System.out.print(element + " ");
		System.out.println();
		
		xz = rev.revers_massiv(arr);
		System.out.println("Revers: ");
		for(int element : xz)
		System.out.print(element + " ");
	}

}
