public class Contact
{
	String name;
	String phoneNumber;
	
	public Contact(String n, String pn)
	{
		name =n;
		phoneNumber=pn;
	}

public void setname(String n)
{
	name=n;
}
public String getname()
{
	return name;
	
}

public void contdisplay()
{
	System.out.println("NAME : " + name);
	
	System.out.println("PHONE NUMBER : " + phoneNumber);
	
	System.out.println("*****************************");
}

}