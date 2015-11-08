import java.util.ArrayList;
import java.util.List;

public class PersonDAO_Mock implements PersonDAO
{
	ArrayList<Person> pp  = new ArrayList<Person>();
	
	public PersonDAO_Mock() 
	{
		pp.add( new Person(10, "Vasia", "Pupkin", 23) );
		pp.add( new Person(11, "Kasia", "Lupkin", 33) );
		pp.add( new Person(14, "Basia", "Hupkin", 25) );
	}
	
	public void create(Person p)
	{
		pp.add(p);
	}
	public List<Person> read() 
	{
		return pp;
	}
	public void update(Person p)
	{

	}
	public void delete(Person p)
	{
		
	}

}
