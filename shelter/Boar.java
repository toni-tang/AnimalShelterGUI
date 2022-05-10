package shelter;

public class Boar extends Animal
{
	private BoarBreed breed;

	public Boar(BoarBreed breed, String name, Gender gender, int age)
	{
		super(name, gender, age);
		this.breed = breed;
	}

	public String breed()
	{
		return breed.name();
	}

	public String family()
	{
		return "boar";
	}

	@Override
	public String toString()
	{
		return super.toString() + " Breed:" + breed;
	}
}