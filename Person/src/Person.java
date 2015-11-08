
public class Person {
	public Person() {
		super();
	}

	int id;
	String fname;
	String lname;
	int age;

	public Person(int id, String fname, String lname, int age) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}
