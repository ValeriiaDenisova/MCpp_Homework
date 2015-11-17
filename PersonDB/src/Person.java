
public class Person 
{
	int id;
	String fname;
	String lname;
	int age;
	
	public Person() 
	{
		//
	}
	
	public Person(int id, String fname, String lname, int age) 
	{
		this.id    = id;
		this.fname = fname;
		this.lname = lname;
		this.age   = age;
	}

	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	public String toCSV() 
	{
		return id + ", " + fname + ", " + lname + ", " + age + "\n";
	}
	
	public String toXML() 
	{
		return "<Person>\n" + "\t<id>\t " + id + "\t</id>\n" + "\t<fname>\t " + fname + "\t</fname>\n" + "\t<lname>\t " + lname + "\t</lname>\n" + "\t</fname>\n" + "\t<age>\t " + age + "\t</age>\n" + "</Person>\n";
	}
	
	public String toJSON() 
	{
		return "{id: " + id + ", fname: " + fname + ", lname: " + lname + ", age: " + age + "}" + "\n";
	}
	

}
