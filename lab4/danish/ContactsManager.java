import java.util.*;
public class ContactsManager
{
ArrayList<Contact> CL=new ArrayList<Contact>();
int contactCount=0;
public void addContact(String n, String pn)
{
		Scanner in=new Scanner(System.in);
boolean signal=false;

	if(CL.size()>0)
	{
		for(int i=0;i<CL.size();i++)
		{
			
	
			Contact check=CL.get(i);
			
			if(check.getname().equals(n))
			{
				System.out.println("Please use a diﬀerent name’, Contact with the same name already exits: ");
				
				signal=true;
				break;
			}
		}
	}
	if(signal)
	{
	String t=in.next();
	}
	Contact temp=new Contact(n, pn);
	CL.add(temp);
	contactCount++;
	
}
public void searchContact(String n)
{
	boolean signal=true;
	for(int i=0;i<CL.size();i++)
	{
		
		Contact check=CL.get(i);

	
		
	if(check.getname().equals(n))
		{
		
			check.contdisplay();
			signal=false;
		}
	}
	
	if(signal)
	{
		System.out.println("There is no contact exist against the name you entered");
	}
	
}


public void remove(String n)
{
	Iterator<Contact> point=CL.iterator();
	boolean signal=true;
	while(point.hasNext())
	{
		Contact temp=point.next();
		if(temp.getname().equals(n))
		{
			point.remove();
			System.out.println(n+" has been removed from the Contact list ");
			signal=false;
	}
	}
	if(signal)
	{
	System.out.println(n+" name is not found in contact list ");
	}
}



public static void main(String args[])
{
	ContactsManager obj = new ContactsManager();
	System.out.println("___________________****************CONTACTS****************__________________");
	Scanner in=new Scanner(System.in);
	
	int click=1;
	while(click!=0)
	{
	System.out.println("\n Enter the following optons according to their functions \n");
	System.out.println("1 : To Add a contact ");
	System.out.println("2 : To Search contact ");
	System.out.println("3 : To Add a contact ");
	System.out.println("0 : To exit  ");
	
	click=in.nextInt();
	if(click==1)
	{
	
	String n, pn;
	System.out.print("NAME: ");n=in.next();
	System.out.print("PHONE NUMBER ");pn=in.next();


	obj.addContact(n, pn);

	System.out.println("CONTACT IS SECSECCFULLY SAVED");
	}
	
	if(click==2)
	{
		System.out.println("Enter contact nanme ");
		String searchname=in.next();
		obj.searchContact(searchname);
	}
	
	if(click==3)
	{
			System.out.println("Enter contact name to remove ");
		String remove=in.next();
		obj.remove(remove);
	
	
	}
	
	}
}

}