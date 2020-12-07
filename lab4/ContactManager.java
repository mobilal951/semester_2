/*
  "Lab-04"
Name: Muhammad Junaid Tariq
Section: B
Submitted to: Sir Asjid

*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class ContactManager{
 Scanner input=new Scanner(System.in);
 private long phoneNumber;
 private String name;
 private String search; 
 private boolean flag=false;
 private boolean flag1=false;
 

 ArrayList<Contact> contactList=new ArrayList<Contact>();
 
 public void takeInput(){
  System.out.println("Enter the name of the contact:");
  
  name=input.nextLine();
  System.out.println("Enter the contact number:");
  phoneNumber=input.nextLong();
  input.nextLine(); 
  }
 

 public void addContact(){
  contactList.add(new Contact(name,phoneNumber));
  }
 
 public void searchContact(){
  System.out.println("Enter the name to search:");
  search=input.nextLine();
  for(Contact i: contactList){
   if(i.getName().equals(search)){
    flag=true;
    System.out.println("Name:"+i.getName());
    System.out.println("Phone Number:"+i.getPhoneNumber());
    break;
    }
   else{
    flag=false;
   }
  }
  if(flag==true){
   System.out.println("Contact has found");
  }
  else{
   System.out.println("Contact has not found");
   }
 }

 public void removeContact(){
  System.out.println("Enter the name to remove:");
  search=input.nextLine();
  for(Contact i: contactList){
   if(i.getName().equals(search)){
    flag1=true;
    contactList.remove(i);
    System.out.println("Contact has successfully deleted.");
    break;
    }
   }
   if(flag1==false){
    System.out.println("Contact has not found.");
   }
 } 
     
 

 public void displayContact(){
  System.out.println("'Here is the contact list.'");
  for(Contact i: contactList){
   System.out.println("Name:"+i.getName());
   System.out.println("Phone Number:"+i.getPhoneNumber()); 
  }
 }

 public static void main(String [] args){
  ContactManager cm=new ContactManager();
  System.out.println("//Input of data for contacts:");
  for (int i=0;i<5;i++){
   cm.takeInput();
   cm.addContact();
  }
  System.out.println("\n");
  System.out.println("//Displaying of all the contacts:");
  cm.displayContact();
  System.out.println("\n");
  System.out.println("//Searching for a contact in contact list:");
  cm.searchContact();
  System.out.println("\n");
  System.out.println("//Deleting of a contact:");
  cm.removeContact();
  System.out.println("\n");
  System.out.println("//Displaying of all the contacts after deleting a contact:");
  cm.displayContact();
 }
}