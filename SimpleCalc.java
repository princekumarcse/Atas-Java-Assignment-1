//8.Write a Java program to find the simple calculator using switch statement.
package Assignment_1;
import java.util.*;
public class SimpleCalc {
    
	int num1,num2;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("***************************");
		System.out.println("Enter 1 For Addition\nEnter 2 For Substraction");
		System.out.println("Enter 3 For Multiplication\nEnter 4 For Division\nEnter 5 For Reminder");
		System.out.println("***************************");
		
		System.out.println("Enter Your  Choice: ");
		int Choice=sc.nextInt();
	
		switch(Choice) {
		case 1:
			int sum=num1+num2;
			System.out.println("Addition is: "+sum);
			break;
		case 2:
			int sub=num1-num2;
			System.out.println("Substraction is: "+sub);
			break;
		case 3:
			int mul=num1*num2;
			System.out.println("Multiplication is: "+mul);
			break;
		case 4:
			int div=num1/num2;
			System.out.println("Division is: "+div);
			break;
		case 5:
			int rem=num1%num2;
			System.out.println("Reminder  is: "+rem);
			break;
			default:
				System.out.println("Kindly Choose Valid Option");
		}
			
	}

}
