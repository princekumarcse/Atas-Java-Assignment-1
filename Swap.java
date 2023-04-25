//2. Write a Java program to swap two numbers.
package Assignment_1;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("Original Value of Num1 and Num2: "+num1+" "+num2);//print original value
	
	int temp=num1;//swapping code
	num1=num2;
	num2=num1;
	System.out.println("After Swap Value of Num1 and Num2: "+num1+" "+num2);//print Swapping number
	}

}
