//  IN-LAB 2 : Solution
//  Name = Saleh Sammer Khalid
//  Roll No = 0002-BSCS-2019 (Section B)


public class Book
{
	private String title;
	private Author author;
	private boolean borrowed;
	private int bookNumber;
	
	public Book(String title,int bookNumber,boolean isborrowed)
	{
		this.title=title;
		borrowed=isborrowed;
		this.bookNumber=bookNumber;
	}

	public Book()
	{
		
	}
	
	public void setTitle(String name)
	{
		title=name;
	}
	
	public String getTitle()
	{
		return (title);
	}
	
	public void setAuthorname(Author name)
	{
		author=name;
	}
	
	public Author getAuthorname()
	{
		return (author);
	}
	
	// Marks the book as rented
	public void borrowed()
	{
		this.borrowed=true;
		System.out.println("Borrowed is " + borrowed);
	}
	
	// Marks the book as not rented
	public void returned()
	{
		this.borrowed=false;
		System.out.println("Borrowed is " + this.borrowed + " means book is returned");
	}
	
	// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() 
	{
    		if (this.borrowed)
		{
    			return true;
    		}
		else
		{
    			return false;
    		}
    	}
	
	public boolean getStatus()
	{
		return (borrowed);
	}

	public void setBookNumber(int no)
	{
		bookNumber=no;
	}

	public int getBookNumber()
	{
		return (bookNumber);
	}
	
	public void display()
	{
		System.out.println("Title of book is " + title);
		System.out.println("Status of book is (borrowed or not) " + borrowed);
		System.out.println("Book number is " + bookNumber);
	}
	
	public static void main(String args[])
	{
		Book B[]=new Book[5];
		Book B1=new Book();
		Book B2=new Book();
		B[1]=new Book("Harry Potter",001,false);
		B[2]=new Book("Burnt Shadows",002,false);
		B[3]=new Book("Brainy",003,false);
		B[4]=new Book("Broken Verses",004,false);

		System.out.println("Title (should be Harry potter): " + B[1].getTitle());
		System.out.println("Borrowed? ( should be false ) : " + B[1].isBorrowed () ) ; 
		B[1].borrowed () ; 
		System.out.println ("Borrowed? ( should be true ) : " + B[1].isBorrowed () ) ; 
		B[1].returned () ; 
		System.out.println ("Borrowed? ( should be false ) : " + B[1].isBorrowed () ) ; 

		System.out.println();

		B1.setTitle("Brainy");
		B1.setBookNumber(003);
		B2.setTitle("Broken Verses");
		B2.setBookNumber(004);

		System.out.println("Displaying attributes by storing values using setter methods");
		B1.display();

		System.out.println();
		
		B2.display();
		
		System.out.println();

		System.out.println("Displaying attributes by using Array of Objects");
		for(int i=1;i<=4;i++)
		{
			B[i].display();
			System.out.println();
		}
		
	}
}
