public class Book
{
    private String title;
    private Author author;
    private Boolean borrowed;
    private int bookNumber;
    
    public Book()
    {

    }

    public Book(String title)
    {
        this.title=title;        
    }

    public Book(String title,Boolean borrowed,int bookNumber)
    {
        this.title=title;
        this.borrowed=borrowed;
        this.bookNumber=bookNumber;        
    }
    public void setName(String title)
    {
        this.title=title;
    }
    public String getName()
    {
        return title;
    }
    public void setAuthor(Author author)
    {
        this.author=author;
    }
    public Author getAuthor()
    {
        return author;
    }
    public void setBookNumber(int bookNumber)
    {
        this.bookNumber=bookNumber;
    }
    public int getBookNumber()
    {
        return bookNumber;
    }
    public void display()
    {
        System.out.println("Name : "+title+"\t Book Number : "+bookNumber+"\t Is borrowed : "+borrowed);
    }
    

    public void borrowed()
    {
        this.borrowed=true;
        
        System.out.println("Borrowed is : "+borrowed);
    }
    public void returned()
    {
        this.borrowed=false;

        System.out.println("Borrowed is : "+this.borrowed);
    }

     
   /* public boolean isBorrowed()
    {
        if (this.borrowed)
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/

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




    public static void main(String []args)
    {
       Book book1=new Book("My Book 1",true,1);
       Book book2=new Book("My Book 2",false,2);
       Book book3=new Book();
       Book book4= new Book();
       
       book3.setName("My Book 3");
       book3.setBookNumber(3);
       book3.borrowed=true;
       book4.setName("My Book 4");
       book4.setBookNumber(4);
       book4.borrowed=false;
       
         /*  bookArray[]=new Book[4];
bookArray[]=
      for(int i=0;i<bookArray.length;i++)
      {
          bookArray[i].display();
      }*/

       book1.display();
       book2.display();
       book3.display();
       book4.display();

  Book example = new Book("Harry potter");
System.out.println("Title (should be Harry potter): "+example.getName());

  System.out.println("borrowed? (should be false): "+example.isBorrowed());
 
example.returned();
  
System.out.println("borrowed? (should be true): "+example.isBorrowed());

example.returned();
       
System.out.println("borrowed? (should be false): "+example.isBorrowed());









    }
}