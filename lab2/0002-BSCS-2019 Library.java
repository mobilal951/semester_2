//  IN-LAB 2 : Solution
//  Name = Saleh Sammer Khalid
//  Roll No = 0002-BSCS-2019 (Section B)


public class Library

{
	
	private Book Books[]=new Book[10];
	
	private String libraryHours;
	
	private String address;
	
	private boolean borrowed=false;
	private int index=0;	

	
	public Library(String address)
	
	{
		
		this.address=address;
		
	}

	
	
	public void setLibraryhours(String libraryHours)
	
	{
		
		this.libraryHours=libraryHours;
	
	}

	
	
	public String getLibraryhours()
	
	{
		
		return (this.libraryHours);
	
	}
	

	
	public void setAddress(String address)
	
	{
		
		this.address=address;
	
	}
	
	

	public String getAddress()
	
	{
		
		return (this.address);
	
	}

	
	
	public void addbook(Book book)
	
	{

		if(index==10)
		{
			System.out.println("Error Memory Full");
		}		
		Books[index++]=book;
	
	}
	

	
	public void printOpeningHours()
	
	{
		
		System.out.println("Library Opening hours are : " + libraryHours);
	
	}
	
	

	public void printAddress()
	
	{
		
		System.out.println("Address of Library is : " + this.address);
	
	}
		
	
	
	
	public boolean borrowBook(String BookName) 
	
	{ 

		for(int i=0;i<index;i++)
		{		
			if (Books[i].getTitle()==BookName) 
		
			{

				if(Books[i].isBorrowed())
				{
					System.out.println("Sorry, this book is already borrowed");
					
				}
				else
				{
					Books[i].borrowed();
					System.out.println("You succesfully borrowed "+Books[i].getTitle());
					return true;
				}
			}	
		
		
		}

		System.out.println("Sorry, this book is not in our Library");

		return false;
	}
	
	public void printAvailableBooks()
	
	{
		
		for(int i=0;i<index;i++)
		
		{
			
			Books[i].display();
		
		}
	
	}


	public boolean returnBook(String BookName) 
	
	{ 

		for(int i=0;i<index;i++)
		{
			if (Books[i].getTitle()==BookName) 
		
			{

				Books[i].
returned();
				System.out.println("You succesfully returned " + BookName);
				return false;
			
			}

			else
			{	
				System.out.println("This book " + BookName +" does not belongs to this Library ");
				break;
			}
		}
		return true;
	}
	

	
	
	public static void main(String[] args)
	
	{
		
		Library L1 = new Library("GCU Main Library");
        	
		Library L2 = new Library("GCU Postgraduate Library");
	
		
		L1.addbook(new Book("Object Oriented Programming",1,false));
		
		L1.addbook(new Book("Digital Logic Design",2,false));
		
		L1.addbook(new Book("Linear Algebra",3,false));
		
		L1.addbook(new Book("Probability and Statistics",4,false));

		
		
		L2.addbook(new Book("Programming Fundamentals",1,false));
		
		L2.addbook(new Book("Applied Physics",2,false));
		
		L2.addbook(new Book("Pakistan Studies",3,false));
		
		L2.addbook(new Book("English Grammar",4,false));

		
		
		L1.setLibraryhours("8:00 AM to 2:00 PM");

		L1.printOpeningHours();

		L2.setLibraryhours("2:00 PM to 9:00 PM");

		L2.printOpeningHours();

		System.out.println();
		
		
		L1.printAddress();
		
		L2.printAddress();

		

		System.out.println();
		
		System.out.println("Borrowing (Object Oriented Programming) : ");
		
		
		L1.borrowBook("Object Oriented Programming");

		

		System.out.println();
	

		System.out.println("Borrowing (Programming Fundamentals) : ");

		L2.borrowBook("Programming Fundamentals");


		System.out.println();
		
		
		System.out.println("Books in the first library are : ");
		
		L1.printAvailableBooks();


		System.out.println();


		System.out.println("Books in the second library are : ");
		
		L2.printAvailableBooks();

		
		
		System.out.println();
		

		
		System.out.println("Returning (Object Oriented Programming)");
		
		L1.returnBook("Object Oriented Programming");
		
		
		

		System.out.println();


		
System.out.println("Returning (Programming Fundamentals)");
		
		L2.returnBook("Programming Fundamentals");
		
				
	
	}

}