package shelter;

public abstract class Animal
{
	private String name;
	private Gender gender;
	private int age;

	public Animal(String name, Gender gender, int age)
	{
		if(age < 0) {throw new IllegalArgumentException("Invalid age!");}

		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public abstract String breed(); 
	public abstract String family();

	@Override
	public String toString()
	{
		return  "Gender:" + gender + " Name:"+ name + " Age:" + age;
	}

}