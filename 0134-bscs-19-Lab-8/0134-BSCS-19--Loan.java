/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/

import java.util.Scanner;
public abstract class Loan implements LoanConstants
{
	protected static int loanNumber=1;
	protected String name;
	protected int loanAmount;
	protected String  term;
	protected double interestRate;
	protected double currentPrimeInterestRate;
	protected String LoanType;
	
	//constructor
	public Loan(String name,int loanAmount,int choose)
	{
		this.name=name;
		this.loanAmount=loanAmount;
		if(choose==1)
		{
		    term=shortTerm;
		}
		else if(choose==2) 
		{
			term=mediumTerm;
		}
		else if(choose==3) 
		{
			term=longTerm;
		}
		
	}
	//toString abstract method for displaying:
	public abstract String toString();

}
