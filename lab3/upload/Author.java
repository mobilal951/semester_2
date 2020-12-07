public class Author
{
    String name;
    String email;
    Author()
    {
        
    }
    Author(String name,String email)
    {
        this.name=name;
        this.email=email;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    String getEmail()
    {
        return email;
    }
    void updateEmail(String newEmail)
    {
        email=newEmail;
    }
    void display()
    {
        System.out.println("Name : "+name+"\tEmail : "+email);
    }
    public static void main(String []args)
    {
        Author author1=new Author("Author 1","author1@gmail.com");
        Author author2=new Author("Author 2","author2@gmail.com");
        
        author1.display();
        author2.display();
    }
}