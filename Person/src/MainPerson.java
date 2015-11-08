import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Person[] pp = new Person[5];
		//init(pp);
		List<Person> pp = new ArrayList<Person>();
		initFromH2(pp);
		print(pp);
	}

		public static void print(List<Person> pp){
			for (Person p : pp) {
				System.out.println( p );
			}
		}
/*
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
*/
	public static void init(Person[] pp) {
		pp[0] = new Person(50, "Vasia", "Zubovz", 25);
		pp[1] = new Person(120, "Petia", "gvozd", 50);
		pp[2] = new Person(451, "Nikita", "Noberko", 34);
		pp[3] = new Person(200, "lena", "hokobot", 46);
		pp[4] = new Person(75, "Olia", "Ooroh", 80);
	}

	public static void initFromH2(List<Person> pp) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from PERSON");
		while (rs.next()) {
			Person p = new Person(rs.getInt("id"), rs.getString(2), rs.getString(3), rs.getInt("age"));
			pp.add(p);
		}
	}
	
	public static void initFromMySQL(List<Person> pp) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("com.mysql.jdbc.Driver");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from PERSON");
		while (rs.next()) {
			Person p = new Person(rs.getInt("id"), rs.getString(2), rs.getString(3), rs.getInt("age"));
			pp.add(p);
		}
	}
	
	public static void initFromMSSQL(List<Person> pp) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=Demo;integratedSecurity=true;");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from PERSON");
		while (rs.next()) {
			Person p = new Person(rs.getInt("id"), rs.getString(2), rs.getString(3), rs.getInt("age"));
			pp.add(p);
		}
	}
}
