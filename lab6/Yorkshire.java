//LAB 5 : Solution
//Muhammad Bilal
//0134-BSCS-2020 (Section B)

class Yorkshire extends Dog//3.1 Write a class Yorkshire that extends Class Dog
{
	Yorkshire(String name)// Write a constructor that initialize the name in the parent class
	{
		super(name);
		//this.name=name;
	}
	public String speak()// 3.3 Override the speak method in the parent class that returns "Woof"

	{
		return "woof";
	}
}