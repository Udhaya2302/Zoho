 class Animals{

	 void dog()
	{
	}
	void cat()
	{
	}
}

class Cats extends Animals{

	void cat()
	{
		System.out.println("Cat Meows...");
	}
}

class Dogs extends Animals{

	void dog()
	{
		System.out.println("Dog Barks...");
	}
}


class Task4{
public static void main(String[] args )
{
	Animals a=new Dogs();

	a.dog();

	Animals b=new Cats();

	b.cat();
}
}