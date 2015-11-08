import java.util.List;

public interface PersonDAO 
{
	public void create(Person p);
	public List<Person> read();
	public void update(Person p);
	public void delete(Person p);
}
