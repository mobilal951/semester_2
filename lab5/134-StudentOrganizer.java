//Lab 5:Solution
//Name : Muhammad bilal
//Roll no : 034-BSCS-19-B
import java.util.*;
public class StudentOrganizer
{
	ArrayList<Student> al=new ArrayList<Student>();
	public void addStudent(Student s)
	{
		al.add(s);
	}
	public void removeStudent(Student s)
	{
		/*for(Student point :al)
		{
			if(point==s)
			{
				al.remove(point);
			}
		}*/
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			if(it.next()==s)
			{
				al.remove(s);
			}
		}
		
	}
	public int studentCount()
	{
		return al.size();
	}
	public void printResultOfAll()
	{
		for(Student s:al)
		{
			s.printResult();
		}
	}
	boolean found;//flag variable
	public boolean searchStudent(String name)//6
	{
	Iterator<Student> it=al.iterator();
	
	while(it.hasNext())
	{
			if(it.next().getStudentName().equals(name))
			{
				found=true;
			}
			else
			{
				found=false;
				System.out.println("Student's presense : "+found);
			}
	}
	return found;
	}
	public void printResultOf(String name)//7
	{
		for(Student s:al)
		{
			if(s.getStudentName().equals(name))
			{
				s.printResult();
			}
		}
	}
	public void printAllNames()//8
	{
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			int i=1;
			String sname=it.next().getStudentName();
			System.out.println(i+". "+sname);
			i++;
		}
	}
	public void printDuplicate()//9
	{
		for(int i=0;i<al.size();i++)
		{
			String keyName=al.get(i).getStudentName();//name for comparing
			//for(Student s:al)
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).getStudentName().equals(keyName))
				{
					System.out.println(keyName+" has duplicate.");//comparing with all
				}
				else{
					System.out.println("No student has duplicate name");
				}
			}
		}
	}
	public void averageOfSubject(String subName)//10  //chem//phy//math//bio//eng
	{
		int total=0;
		if(subName.equalsIgnoreCase("chemistery"))
		{
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			total+=it.next().getChem_marks();
		}
		int avg=total/(al.size());
		System.out.println("Avergae marks in chemistery : "+avg);
		}
		
		else if(subName.equalsIgnoreCase("physics"))//phy
		{
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			total+=it.next().getPhy_marks();
		}
		int avg=total/(al.size());
		System.out.println("Avergae marks in Physics : "+avg);
		}
		
		else if(subName.equalsIgnoreCase("maths"))//math
		{
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			total+=it.next().getMath_marks();
		}
		int avg=total/(al.size());
		System.out.println("Avergae marks in Maths : "+avg);
		}
		
		else if(subName.equalsIgnoreCase("biology"))
		{
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			total+=it.next().getBio_marks();
		}
		int avg=total/(al.size());
		System.out.println("Avergae marks in Biology : "+avg);
		}
		
		else if(subName.equalsIgnoreCase("english"))
		{
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			total+=it.next().getEng_marks();
		}
		int avg=total/(al.size());
		System.out.println("Avergae marks in English : "+avg);
		}
		else
		{
			System.out.println("Subject doesnt exist.");
		}
	}
	public void averageStudentMarks()
	{
		int chem=0,math=0,eng=0,phy=0,bio=0;
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			chem+=it.next().getChem_marks();
		}
		while(it.hasNext())
		{
			math+=it.next().getMath_marks();
		}
		while(it.hasNext())
		{
			eng+=it.next().getEng_marks();
		}
		while(it.hasNext())
		{
			phy+=it.next().getPhy_marks();
		}
		while(it.hasNext())
		{
			bio+=it.next().getBio_marks();
		}
		int subTotal=eng+math+phy+chem+bio;
		int stuAvg=subTotal/(al.size());
		System.out.println("avergae marks of students are"+stuAvg);
		
	}
	
	
}