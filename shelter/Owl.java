package shelter;

public class Owl extends Animal
{
	private OwlBreed breed;

	public Owl(OwlBreed breed, String name, Gender gender, int age)
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
		return "owl";
	}

	@Override
	public String toString()
	{
		return super.toString() + " Breed:" + breed;
	}
}