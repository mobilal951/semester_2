/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/

public abstract class Element
 {
	protected String symbol;
	protected int massNumber;
	protected double atomicMass;

	public Element(String symbol,int massNumber,double atomicMass)
	{
		this.symbol=symbol;
		this.massNumber=massNumber;
		this.atomicMass=atomicMass;
	}
	
	//getters
	public String getSymbol()
	{
		return this.symbol;
	}
	
	public int getMassNumber()
	{
		return this.massNumber;
	}
	
	public double getAtomicMass()
	{
		return this.atomicMass;
	}
	
	public abstract void describeElement();
	

}
