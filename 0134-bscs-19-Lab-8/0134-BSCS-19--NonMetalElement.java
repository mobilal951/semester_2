/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/
public class NonMetalElement extends Element
{
	//constructor
	public NonMetalElement(String symbol,int atomicNumber,double atomicMass)
	{
		super(symbol,atomicNumber,atomicMass);
	}
	//describe element method
	public void describeElement()
	{
		getSymbol();
		getMassNumber();
		getAtomicMass();
		System.out.println("1.Non-Metals are bad conductors of electricity\n"+"2.Form acidic oxides\n"+"3. Dull low lustre and brittle\n"+"4. Low densities\n"+"5. Low melting points and high electro negativity.");
	}
}
