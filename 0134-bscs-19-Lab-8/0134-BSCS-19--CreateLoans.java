/*
NAME: Muhammad Bilal
ROLL NO: 0134-BSCS-2019
SECTION : B
*/


import java.util.Scanner;
public class CreateLoans {
	//main method
	public static void main(String[] args)
	{
	//attributes
		String name;
		String term;
		int loanAmount;
		int choose;
		String loanType;
		double rate;
		
		Scanner s=new Scanner(System.in);
		
		Loan[] l=new Loan[5];
		
        System.out.println("Enter the prime interest rate:");
        rate=s.nextDouble();
        s.nextLine();
        //loop for setting of data in array:
		for(int i=0;i<5;i++)
			{
			System.out.println("Enter the loan type:");
			loanType=s.nextLine();
			System.out.println("Enter the name:");
			name=s.nextLine();
			System.out.println("Enter the loan amount:");
			loanAmount=s.nextInt();
			System.out.println("1.Short term=1-year\n2.Medium term=3-year\n3.Long term=5-year\n");
			System.out.println("Choose the term:");
			choose=s.nextInt();
			if(loanType.equals("PersonalLoan"))
				{
				l[i]=new PersonalLoan(name,loanAmount,choose,rate);
				
			}
			else if(loanType.equals("BusinessLoan"))
				{
				l[i]=new BusinessLoan(name,loanAmount,choose,rate);
			}
			s.nextLine();
		}
		//loop for displaying the stored data:
		for(int i=0;i<5;i++)
			{
			System.out.println(l[i]);
		}
		
		
		
	}

}
