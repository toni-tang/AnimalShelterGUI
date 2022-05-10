package shelter;
import java.util.ArrayList;

public class Shelter
{	
	private String name;
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	public Shelter(String name)
	{
		this.name = name;
	}

	public void addAnimal(Animal animal)
	{
		animals.add(animal);
	}

	@Override
	public String toString()
	{
		String str = new String();

		for(Animal a : animals)
		{
			str += a.toString() + "\n";
		}

		return str;
	}
}