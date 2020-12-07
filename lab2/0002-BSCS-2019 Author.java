//  IN-LAB 2 : Solution
//  Name = Saleh Sammer Khalid
//  Roll No = 0002-BSCS-2019 (Section B)


public class Author
{
	private String name;
	private String email;
	
	 Author(String name,String email)
	{
		this.name=name;
		this.email=email;
	}

	public Author()
	{
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		System.out.println("Name of Author is " + name);
		return (name);
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public boolean updateEmail(String newEmail)
	{
		email=newEmail;
		System.out.println("Email has been updated successfully");
		System.out.println("Email of Author is updated to " + email );
		return true;
	}

	public String getEmail()
	{
		System.out.println("Email of Author is " + email );
		return (email);	
	}
	
	public void display()
	{
		System.out.println("Name of Author is " + name );
		System.out.println("Email of Author is " + email );
	}
	
	public static void main (String [] args)
	{
		Author A1=new Author("Ahmed","ahmed@gmail.com");
		Author A2=new Author("Ali","ali@gmail.com");
		Author A3=new Author();
		
		A1.display();

		System.out.println();

		A2.display();
		
		System.out.println();

		A1.updateEmail("ahmad2@gmail.com");

		System.out.println();
		
		System.out.println("After updating email new email is : ");
		A1.display();

		System.out.println();

		System.out.println("Displaying by calling getter methods");
		A3.setName("Bilal");
		A3.getName();
		A3.setEmail("bilal@gmail.com");
		A3.getEmail();

	}
}
	