// name : Muhammad Bilal
// roll no. 0134-BSCS-2020 (Section B)
import java.util.*;
import java.io.File;// to create a file
import java.io.FileWriter;// to write a file
import java.util.Scanner;// to reaad a file
import java.util.ArrayList;
public class wordCount
{
	public static void main(String []args)
	{
		try
		{
			File fileobj=new File("word\'sCount.txt");
			if(fileobj.createNewFile())
			{
				System.out.println("File created.");
			}
			else
			{
				System.out.println("File already exists.");
			}
			
			FileWriter pen=new FileWriter(fileobj);
			pen.write("Let's count the words \nin this file");
			pen.close();
			
			
			Scanner filereader=new Scanner(fileobj);
			int size=0;
			while(filereader.hasNextLine() )
			{
				String line=filereader.nextLine();
				String words[]=line.split(" ");
				size=size+words.length;
			}
		
			/*ArrayList<String> al=new ArrayList<String>();
			
			Scanner filereader=new Scanner(fileobj);
			while(filereader.hasNextLine())
			{
				al.add(filereader.next());
			}
			System.out.println(al.size());*/

			System.out.println(size);
		}
		catch(Exception e)
		{
			
		}
	}
}