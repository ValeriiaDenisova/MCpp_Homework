
public class MainPerson {

	public static void main(String[] args) {

		Person[] pp = new Person[5];
		pp[0] = new Person();
		pp[0].id = 50;
		pp[0].fname = "Vasia";
		pp[0].lname = "Zubovz";
		pp[0].age = 25;

		pp[1] = new Person();
		pp[1].id = 120;
		pp[1].fname = "Petia";
		pp[1].lname = "gvozd";
		pp[1].age = 50;

		pp[2] = new Person();
		pp[2].id = 451;
		pp[2].fname = "Nikita";
		pp[2].lname = "Noberko";
		pp[2].age = 34;

		pp[3] = new Person();
		pp[3].id = 200;
		pp[3].fname = "lena";
		pp[3].lname = "hokobot";
		pp[3].age = 46;

		pp[4] = new Person();
		pp[4].id = 75;
		pp[4].fname = "Olia";
		pp[4].lname = "Ooroh";
		pp[4].age = 80;

		for (int i = 0; i < pp.length; i++) {
			System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
		}
		System.out.println();

		for (int i = 0; i < pp.length; i++) {
			if (pp[i].age >= 18 && pp[i].age <= 45) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		for (int i = 0; i < pp.length; i++) {
			if (pp[i].id > 100) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		for (int i = 0; i < pp.length; i++) {
			if (pp[i].fname.length() == 6) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		System.out.println("Familiia sodergit v seredine 'Z'");
		for (int i = 0; i < pp.length; i++) {
			if (pp[i].lname.substring(1, pp[i].lname.length() - 1).contains("z")) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		System.out.println("Familiia zakanchivaetsia na 'ko'");
		for (int i = 0; i < pp.length; i++) {
			if (pp[i].lname.substring(pp[i].lname.length() - 3, pp[i].lname.length()).contains("ko")) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		System.out.println("Imia i familiia nachinautsa na odnu bukvu");
		for (int i = 0; i < pp.length; i++) {
			if (pp[i].fname.substring(0, 1).equals(pp[i].lname.substring(0, 1))) {
				System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
			}
		}
		System.out.println();

		System.out.println("Esli imia ili familiia nachin c malenkoj bukvi");
		for (int i = 0; i < pp.length; i++) {
			String a = pp[i].fname.substring(0, 1).toUpperCase();
			pp[i].fname = a + pp[i].lname.substring(1);
			String b = pp[i].fname.substring(0, 1).toUpperCase();
			pp[i].lname = b + pp[i].lname.substring(1);
			System.out.println(pp[i].id + " " + pp[i].fname + " " + pp[i].lname + " " + pp[i].age);
		}
		System.out.println();
	}
}
