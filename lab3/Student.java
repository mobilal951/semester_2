public class Student
{
	String name;
	int rollNumber;
	String department;
	float totalMarks;
	float subject1;
	float subject2;
	float subject3;
	float subject4;
	float subject5;
	float percentage;
	float aquiredMarks;
	Student()
	{
		
	}
	Student(String Name,int roll_number,float total_marks,String Department,float subject_1,float subject_2,float subject_3,float subject_4,float subject_5)
	{
		name=Name;
		rollNumber=roll_number;
		department=Department;
		totalMarks=total_marks;
		subject1=subject_1;
		subject2=subject_2;
		subject3=subject_3;
		subject4=subject_4;
		subject5=subject_5;
	}
	public void setName(String Name)
	{
		name=Name;
	}
	public String getName()
	{
		return name;
	}
	public void setRollNumber(int roll_number)
	{
		rollNumber=roll_number;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public void setDepartment(String Department)
	{
		department=Department;
	}
	public String getDepatment()
	{
		return department;
	}
	public void setTotalMarks(float total_marks)
	{
		totalMarks=total_marks;
	}
	public float getTotalMarks()
	{
		return totalMarks;
	}
	public void setSubject1(float subject_1)
	{
		subject1=subject_1;
	}
	public float getSubject1()
	{
		return subject1;
	}
	
	public void setSubject2(float subject_2)
	{
		subject2=subject_2;
	}
	public float getSubject2()
	{
		return subject2;
	}
	
	public void setSubject3(float subject_3)
	{
		subject3=subject_3;
	}
	public float getSubject3()
	{
		return subject3;
	}
	
	public void setSubject4(float subject_4)
	{
		subject4=subject_4;
	}
	public float getSubject4()
	{
		return subject4;
	}
	
	public void setSubject5(float subject_5)
	{
		subject5=subject_5;
	}
	public float getSubject5()
	{
		return subject5;
	}
	public float calculateAquiredMarks()
	{
		this.aquiredMarks=subject1+subject2+subject3+subject5+subject4;
		return aquiredMarks;
	}
	public float calculatePercentage()
	{
		percentage=(calculateAquiredMarks()/totalMarks)*100;
		return percentage;
	}
	public void display()
	{
		System.out.println("*************Report Card*************");
		System.out.println("Name           :  "+name);
		System.out.println("Roll No.       :  "+rollNumber);
		System.out.println("Department     :  "+department);
		System.out.println("Total Marks    :  "+(int)totalMarks);
		System.out.println("Marks Obtained :  "+(int)calculateAquiredMarks());
		System.out.println("Percentage     :  "+percentage);
	}
	public static void main(String []args)
	{
		Student student1=new Student("ali",134,500,"DCS",100,50,64,100,100);
		//student1.calculateAquiredMarks();
		student1.calculatePercentage();
		student1.display();
	}
	
}