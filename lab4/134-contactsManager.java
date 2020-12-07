//import java.util.ArrayList;
// name : Muhammad Bilal
// roll no. 0134-BSCS-2020 (Section B)

import java .util.*;
public class contactsManager
{
	private int contactsCount=0;
	ArrayList<Contact> contactsList=new ArrayList<Contact>();
	public void addContact(Contact newContact)
	{
		for(int i=0;i<contactsList.size();i++)
		{
			if(contactsList.get(i).getName()==newContact.getName())
			{
				System.out.println("Please use a different name\', Contact with the same name already exits!");
			}
			else
			{
				contactsList.add(newContact);
			}
		}

	}
	public Contact searchContact(String searchName)
	{
		for(int i=0;i<contactsList.size();i++)
		{
			if(contactsList.get(i).getName()==searchName)
			{
				return contactsList.get(i);
			}
			else
			{
				System.out.println("Contact not found.");
				return null;
			}
		}
	}
	public Contact removeContact(String searchName)
	{
		Iterator<Contact> it=contactsList.iterator();
		while(it.hasNext())
		{
			if(it.next().getName()==searchName)
			{
				it.remove();
				
				System.out.println(searchName+" has been removed from the List");
			}
			else
			{
				return null;
			}
		}
	}
	public static void main(String []args)
	{
		contactsManager myContactsManager=new contactsManager();
		Contact newContact=new Contact();
		newContact.setName("usama");
		newContact.setPhoneNumber("0301254645");
		myContactsManager.addContact(newContact);
		
		Contact newContact1=new Contact("umar","03012589631");
		Contact newContact2=new Contact("ali","03212581473");
		Contact newContact3=new Contact("bilal","032114536975");
		myContactsManager.addContact(newContact1);
		myContactsManager.addContact(newContact2);
		myContactsManager.addContact(newContact3);
		
		myContactsManager.searchContact("ali");

		
		
		myContactsManager.removeContact("usama");
		myContactsManager.searchContact("usama");
		
	}
	
}