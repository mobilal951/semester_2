//LAB 5 : Solution
//Muhammad Bilal
//0134-BSCS-2020 (Section B)
class Dog
{
	protected String name;    //1.1 Write  protected field name that stores the name of the Dog.
	
	public Dog(String name)          //1.2 Write appropriate constructor to set the name of the Dog
	{
		this.name=name;
	}
	public String getName()   //1.3 Write a method that returns the name of the Dog
	{
		return name;
	}
	public String speak()     //1.4 Write a method speak that returns string "Woof"
	{
		return "Woof";
	}
}