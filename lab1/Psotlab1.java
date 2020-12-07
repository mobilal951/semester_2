public class Task2
{
 
public static void task1()
{
	System.out.println("***********************TASK1************************");
	System.out.println("   /"+"\\");
	System.out.println("  / "+" \\");
	System.out.println(" /  "+"  \\");
	System.out.println("/   "+"   \\");
	System.out.println("--------");
	System.out.println("  \"  \"");
	System.out.println("  \"  \"");
    System.out.println("  \"  \"");
	System.out.println("***********************************************");
}
    
public static void task2()
{
		System.out.println("***********************TASK2************************");
	System.out.println("1) My Passion");
	System.out.println("2) My Goals");
	System.out.println("3) My Strengths and Weeknesses");
	System.out.println("4) My Biggest Fear");
	System.out.println("***********************************************");
}

public static void task3()
{
	System.out.println("***********************TASK 3************************");
	double x,y=7,z=6;
	x=y+(3*z)-((z+y)/(z-3));
	System.out.println("Question no.1 \nY=7,Z=6");
	System.out.println("if X=Y+3Z-(Z+Y/Z-3)");
	System.out.println("X = " + x);

	x=5*y+((3*z-1)/(4 * (3*z+1) - y));
	System.out.println("\n\nQuestion no.2 \nY=7,Z=6");
	System.out.println("if X = 5*y+((3*z-1)/(4 * (3*z+1) - y))");
	System.out.println("X = " + x);

	x=(x-y)*Math.pow((x-y),2);
	System.out.println("\n\nQuestion no.3 \nY=7");
	System.out.println("if X = (x-y)*Math.pow((x-y),2)");
	System.out.println("X = " + x);

	double  r=8,a=Math.PI*Math.pow(r,2);
	System.out.println("\n\nQuestion no.4 \nr=8");
	System.out.println("if A = pi*r^2");
	System.out.println("A = " + a);	

	int A=10,B=12,Y=30;
	double c=Math.sqrt(/* (Math.pow(A,2) + Math.pow(B,2)) - */(2*A*B*Math.cos(Y))  );
	System.out.println("\n\nQuestion no.5 \na=10,b=12,y(angle)=30");
	System.out.println("if c=(a^2 + b^2 -2abcos(y))^1/2");
	System.out.println("C = " + c);
	System.out.println("***********************************************\n\n");



}

public static void main(String [] args)
{
    task1();
task2();
task3();
}


}