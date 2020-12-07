/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/
public class MetalElement extends Element {
	//constructor:
	public MetalElement(String symbol,int atomicNumber,double atomicMass) {
		super(symbol,atomicNumber,atomicMass);
	}
	//describe method:
	public void describeElement() 
	{
		getSymbol();
		getMassNumber();
		getAtomicMass();
		System.out.println("1.Metals are good conductors of electricity,low ionization energies\r\n" + 
				"2.Low electronegativities\r\n" + 
				"3.Malleable – are able to be pounded into sheets.\r\n" + 
				"4.Ductile – can be pulled into wire.\r\n" + 
				"5.High density (exceptions : lithium, potassium, and sodium.)\r\n" + 
				"6.Corrodes in air or seawater.\r\n" + 
				"7.Loses electrons in reactions.");
	}

}
