import shelter.*;

public class Mass
{
	public static void main(String[] args)
	{	
		try
		{
			Shelter shelter = new Shelter("Rescue Rangers");
			Boar test = new Boar(BoarBreed.MULEFOOT, "Bobby", Gender.MALE, 17);
			Owl test2 = new Owl(OwlBreed.BARN_OWL, "Dog", Gender.FEMALE, 10);

			shelter.addAnimal(test);
			shelter.addAnimal(test2);

			System.out.println(shelter);

		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}
}