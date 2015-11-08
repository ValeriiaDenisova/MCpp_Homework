import java.sql.SQLException;
import java.util.List;

public class xz {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PersonDAO pd = null;
		// pd = new PersonDAO_H2();
		 pd = new PersonDAO_Mock();
		// pd = new PersonDAO_MySQL();

		Person p = new Person(91, "Basik", "Kenov", 99);
		Person update_p = new Person(91, "NEW_FNAME", "NEW_LNAME", 100);
		
		pd.create(p);
		List<Person> pp = pd.read();
		System.out.println("Creat Basik Kenov");
		print(pp);
		
		pd.update(update_p);
		List<Person> pup = pd.read();
		System.out.println("Update Basik Kenov");
		print(pup);

		pd.delete(p);
		List<Person> pdel = pd.read();
		System.out.println("Delete Basik Kenov");
		print(pdel);
	}

	public static void print(List<Person> pp) {
		for (Person p : pp) {
			System.out.println(p);
		}
	}
}
