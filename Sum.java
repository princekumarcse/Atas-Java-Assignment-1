//1. Write a Java program to add two numbers.

package Assignment_1;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//to take input from users
		System.out.println("Enter Two Numbers: ");
		int num1=sc.nextInt();//taking input from usres
		int num2=sc.nextInt();
		int Ans=num1+num2;//addition 
		System.out.println("Sum of "+num1+" And "+num2+ " is: "+Ans);//printing

	}

}
