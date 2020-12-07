//LAB 5 : Solution
//Muhammad Bilal
//0134-BSCS-2020 (Section B)

class Labrador extends Dog // Write a class Labrador that extends class Dog with two fields Color and
                          //breedWieght.
{
	private String color;
	private double breedWeight;
	
	public Labrador(String name ,String color,double breedWeight) //2.2 Write appropriate constructor to initialize color and breedWeight.
	{
		super(name);
		this.color=color;
		this.breedWeight=breedWeight;
	}
	
	public String speak()//2.3 Override the speak method in the parent class that returns string "Woof"
	{
		return "WOOF";
	}
	public String getColor()//2.4 Write a method that returns the color
	{
		return color;
	}
	public double getBreedWeight()  //2.5 Write a method that returns breedWeight
	{
		return breedWeight;
	}
}





