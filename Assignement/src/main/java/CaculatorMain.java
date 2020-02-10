import java.util.Scanner;



public class CaculatorMain {
	public static void main(String args[])
	{ ADD add=new ADD();
	Subtraction s=new Subtraction();
	Multiplication m=new Multiplication();
	Division d=new Division();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Arthemetic operators");
		System.out.println("1)Add\n2)Subtract\n3)multiplication\n4)divison\n");
		
		int option;	
		System.out.print("enter a,b values");
		
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("choose options");
		option=sc.nextInt();
		
		if(option==1) {
			System.out.println("Addition:"+add.Addition(a,b));
			}
		else if(option==2) { 
			System.out.println("Subtraction:"+s.Subtract(a,b));
			}
		else if(option==3) 
		{ System.out.println("Multiplication:"+m.Multiply(a,b));
			
			}
		else if(option==4) 
		{ 
			System.out.println("Division:"+d.Division1(a,b));}
		else 
		{
	System.out.println("Invalid");	
			
		}
		
		
		
		
		
		
	}
}
