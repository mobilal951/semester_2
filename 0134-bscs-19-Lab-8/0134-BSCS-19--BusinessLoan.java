/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/

public class BusinessLoan extends Loan
{
	//constructor
	public BusinessLoan(String name, int loanAmount,int choose,double currentPrimeInterestRate)
	{
		super(name, loanAmount, choose);
		interestRate=1+currentPrimeInterestRate;
		
	}
	   //toString method
	  	public String toString() 
		{
			return ("\n\nCompany Name:"+companyName+"\n"+"Name:"+this.name+"\n"+"Loan Amount:"+this.loanAmount+"\n"+"Term:"+this.term+"\n"+"Interest Rate:"+interestRate+"\n\n");
		}

}
