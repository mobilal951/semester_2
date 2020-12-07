//LAB 5 : Solution
//Muhammad Bilal
//0134-BSCS-2020 (Section B)

class DogTest
{
	public static void main(String [] args)
	{	
		Dog dog1 = new Dog("Milo");
		System.out.println("Simple dog's name : " + dog1.getName());
		System.out.println(dog1.getName() + " says : " + dog1.speak() );
	
		System.out.println("\n");
		
		Labrador lab1 = new Labrador("Oscar","white",75);
		System.out.println("Labrador's name : " + lab1.getName());
		System.out.println(lab1.getName() + " says : " + lab1.speak());
		System.out.println(lab1.getName() + "'s color : " + lab1.getColor());
		System.out.println(lab1.getName() + "'s breed weight : " + lab1.getBreedWeight());
		
		System.out.println("\n");
		
		Labrador lab2 = new Labrador("Max","brown",60);
		System.out.println("Labrador's name : " + lab2.getName());
		System.out.println(lab1.getName() + " says : " + lab2.speak());
		System.out.println(lab1.getName() + "'s color : " + lab2.getColor());
		System.out.println(lab1.getName() + "'s breed weight : " + lab2.getBreedWeight());
		
		System.out.println("\n");
		
		double avgWeight;
		avgWeight=(lab1.getBreedWeight()+lab2.getBreedWeight())/2;
		System.out.println("Average breed weight of Labradors : " + avgWeight);
		
		System.out.println("\n");
		
		Yorkshire york1=new Yorkshire("Lucy");
		System.out.println("Yorkshire's name : " + york1.getName());
		System.out.println(york1.getName() + " says : " + york1.speak());
		
	}
		
	
	
}