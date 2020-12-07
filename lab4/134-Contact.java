// name : Muhammad Bilal
// roll no. 0134-BSCS-2020 (Section B)
public class Contact
{
	public String name;
	public String phoneNumber;
	
	
	Contact()
	{
		this.name=null;
		this.phoneNumber=null;
	}
	public Contact(String name,String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public String getName()
	{
		return name;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}