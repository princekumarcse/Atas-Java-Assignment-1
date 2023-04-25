/*5. Write a Java program to find whether the given number is a positive or negative
number.*/
package Assignment_1;
import java.util.*;
public class PosNeg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		if(num>=0) {
			System.out.println(num+" is Positive");
		}else {
			System.out.println(num+" is Negative");
		}
	}
}
