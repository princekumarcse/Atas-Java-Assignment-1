//4. Write a Java program to find the biggest of two numbers.
package Assignment_1;
import java.util.*;
public class BiggestNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();	
		if(num1>num2) {
			System.out.println(num1+" is Biggest");
		}else {
			System.out.println(num2+" is Biggest");	
		}
	}
}
