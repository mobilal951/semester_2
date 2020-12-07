/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/
import java.util.Scanner;
public class ElementArray 
{
    //main method
	public static void main(String[] args)
	{
		//attributes
		String type;
		String name;
		int atomicNumber;
		double atomicMass;
		Element[] e=new Element[4];
        Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
			{
			System.out.println("Enter the type of element :");
			type=s.nextLine();
			System.out.println("Enter the name of element :");
			name=s.nextLine();
			System.out.println("Enter the atomic number of element :");
			atomicNumber=s.nextInt();
			System.out.println("Enter the atomicMass of element :");
			atomicMass=s.nextDouble();
			
			if(type.equals("Metal"))
			{
			e[i]=new MetalElement(name,atomicNumber,atomicMass);
			}
			else if(type.equals("Non Metal")) 
			{
				e[i]=new NonMetalElement(name,atomicNumber,atomicMass);
			}
			s.nextLine();
		}
        for(int i=0;i<4;i++) 
		{
        	e[i].describeElement();
        	System.out.println();
        	System.out.println();
        }
	}

}
