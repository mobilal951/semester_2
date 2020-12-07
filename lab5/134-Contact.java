//Lab 5:Solution
//Name : Muhammad bilal
//Roll no : 034-BSCS-19-B
import java.util.HashMap;
import java.util.Map;
public class Contact{
	private boolean flag=false;
	HashMap<String,String> hm=new HashMap<String,String>();
	public void addContact(String s,String s1) {
		hm.put(s, s1);
	}
	
	public void searchContact(String s) {
		for(Map.Entry<String,String> i: hm.entrySet()) {
			if(i.getKey().equals(s)) {
				System.out.println("Name: "+i.getKey()+" Phone Number"+i.getValue());
				System.out.println("Contact  found.");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Contact not found.");
		}
	}
	
	public void displayContacts() {
		for(Map.Entry<String,String> i: hm.entrySet()) {
				System.out.println("Name: "+i.getKey()+", Phone Number: "+i.getValue());
			}
	}
	
	
	public void removeContact(String s) {
		for(String i: hm.keySet()) {
			if(i==s) {
				hm.remove(s);
				System.out.println("Contact: "+i+  " removed.");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Contact not found");
		}	
	}
	
	
	public void duplicateContact() {
		
		boolean flag1=false;
		for(String i: hm.keySet()) {
			int count=0;
			for(String s:hm.keySet()) {
				if(s.equals(i)) {
					count++;
				}
			}
			if(count>=2) {
				System.out.println("Contact :"+i+" is "+count+" times  in contact list.");
				flag1=true;
			}	
	    }
	    if(flag1==false) {
		    System.out.println("No duplicate contact found.");
	     }
	}
	
	
	public void mergeContact() {
		boolean flag1=false;
		for(String i: hm.keySet()) {
			int count=0;
			for(String s:hm.keySet()) {
				if(s.equals(i)) {
					count++;
				}
			}
			if(count>=2) {
				hm.remove(i);
				System.out.println("Contact :"+i+" has been merged.");
				flag1=true;
			}	
	    }
	    if(flag1==false) {
	 	     System.out.println("No duplicate contact found.");
	    }
	}
	

	
	public static void main(String[] args) {
		Contact cont=new Contact();
		cont.addContact("Ali", "045454548");
		cont.addContact("Usama", "0454536");
		cont.addContact("Ali", "03774004");
		cont.addContact("Aslam", "030854438");
		cont.addContact("Aziz", "03054545302");
		cont.addContact("Waqas", "4545546665");
		
		cont.displayContacts();
		System.out.println("\n");
		
		cont.searchContact("Aziz");
		System.out.println("\n");
		
		cont.removeContact("Aslam");
		System.out.println("\n");
		
		cont.duplicateContact();
		System.out.println("\n");
		
		cont.mergeContact();
		System.out.println("\n");
		
		cont.displayContacts();
		System.out.println("\n");

	}

}
