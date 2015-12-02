
public class AListMain {

	public static void main(String[] args) {
		AList0 alisr0 = new AList0();
		int [] ini0 = {10,15,12,65,3,18};
		alisr0.init(ini0);
		
		for(int i : alisr0){
			System.out.print(i + ", ");
		}
		System.out.println();
		
		AList1 alist1 = new AList1();
		int [] ini1 = {100,150,120,650,30,180};
		alist1.init(ini1);
		
		for(int i : alist1){
			System.out.print(i + ", ");
		}
		System.out.println();
		
		AList2 alist2 = new AList2();
		int [] ini2 = {1000,1500,1200,6500,300,1800};
		alist2.init(ini2);
		
		for(int i : alist2){
			System.out.print(i + ", ");
		}

	}

}
