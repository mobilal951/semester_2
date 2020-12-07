//Lab 5:Solution
//Name : Muhammad bilal
//Roll no : 034-BSCS-19-B
// do not remove any comments or change order of methods in this file
// if you find any mistake or anythinfg inappropriate sorry for that
// correct it and write in comments about your assumption
public class Student {

//variables
private String studentName;//variable to store Student Name
private String fatherName;//variable to store father Name of student
private String address;//Variable to store address of student 
private int age;// variable to store age of student


// following varibales store marks of students from total marks of 100
private int chem_marks, phy_marks, bio_marks, math_marks, eng_marks;

// declare variable to store grade ,average and percentage here
private double average ,percentage;
private char grade;
private int total;


//parametrized constructor
public Student(String studentName,String fatherName,String address,int age){

this.studentName=studentName;
this.fatherName=fatherName;
this.address= address;
this.age=age;
}

//////////////Seter Methods////////////
private void setStudentName(String studentName){
this.studentName=studentName;
}

private void setFatherName(String b){
 this.fatherName=fatherName;}

private void setAddress(String address){
this.address=address;}

private void setAge(int age){
this.age=age;}

//setters for marks
public void setChem_marks (int marks){

if(marks>=0 && marks<=100) //checks marks vaild i.e between 0 to 100
                   chem_marks=marks;//setting marks
else 
	System.out.println("Invalid marks!\n vaild marks are between 1 and 100");


}


public void setPhy_marks (int marks){

if(marks>=0 && marks<=100)//checks marks vaild i.e between 0 to 100
		 phy_marks=marks;
else
	 System.out.println("Invalid marks!\n vaild marks are between 0 and 100");

}


public void setBio_marks (int marks){

if(marks>=0 && marks<=100)//checks marks vaild i.e between 0 to 100
		  bio_marks=marks;
else
	 System.out.println("Invalid marks!\n vaild marks are between 0 and 100");


}


public void setMath_marks (int marks){

if(marks>=0 && marks<=100)//checks marks vaild i.e between 0 to 100
		  math_marks=marks;
else
	 System.out.println("Invalid marks!\n vaild marks are between 0 and 100");


}


public void setEnglish_marks (int marks){

if(marks>=0 && marks<=100)//checks marks vaild i.e between 0 to 100
		 eng_marks=marks;
else
	 System.out.println("Invalid marks!\n vaild marks are between 0 and 100");


}
public char calculateGrade(int marks)
{
	if(marks>=85)
	{
		grade='A';
		return grade;
	}
	else if(marks>=75)
	{
		grade='B';
		return grade;
	}
	else if(marks>=60)  
	{
		grade='C';
		return grade;
	}
	else if(marks>=50)
	{
		grade='D';
		return grade;
	}
	else if(marks<50)
	{
		grade='F';
		return grade;
	}
	else 
	{
		System.out.println("empty");
		return ' ';
	}
	
}
//////////geter methods////////////
public String getStudentName(){
return(studentName);}


public String getFatherName	(){
return(fatherName);}

public  String getAddress(){
return(address);}

public int getAge(){
return(age);}

public int getChem_marks(){
return (chem_marks);}

public int getPhy_marks(){
return (phy_marks);}

public int getMath_marks(){
return (math_marks);}

public int getBio_marks(){
return (bio_marks);}

public int getEng_marks(){
return (eng_marks);}
public int getTotalMarks()
{
	total=getBio_marks()+getChem_marks()+getEng_marks()+getMath_marks()+getPhy_marks();
	return total;
}



//display method
public void displayStudentDetails()//print student details
{

System.out.println("~~~~~~~~~~~~STUDENT DATA~~~~~~~~~~~~~ \n");
System.out.println("Name:       \t"+getStudentName());
System.out.println("Father Name:\t"+getFatherName());
System.out.println("Age:        \t"+getAge());
System.out.println("Address:     \t"+getAddress());
System.out.println("---------------------------------------------\n\n");

}


/*-------------------calculations----------------*/

/*/

wrtie a method to calculate percentage
preconditons : All of the marks are set and have vaild marks
post
/*/  
private double percentage(){

int average=eng_marks+phy_marks+chem_marks+bio_marks+math_marks;

percentage=(average/500)*100;

return (percentage);
}




//grade functions here

public char getGrade()
{
	return grade;
}

public void printResult(){
	System.out.println("RESULT CARD");
	System.out.println("Student Nam: "+getStudentName());
	System.out.println("Father Name: "+getFatherName());
	System.out.println("\n\nPhysics: "+getPhy_marks());
	System.out.println("Chemistery: "+getChem_marks());
	System.out.println("Biology: "+getBio_marks());
	System.out.println("Math: "+getMath_marks());
	System.out.println("English: "+getEng_marks());
	System.out.println("—————————\n");
	System.out.println("Total: "+getTotalMarks());
	System.out.println("—————————\n\n");
	System.out.println("Percentage: "+percentage());
	System.out.println("Grade: "+getGrade());
	
}
  
}

