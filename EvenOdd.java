//6. Write a Java program about whether a given number is even or odd.
package Assignment_1;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is Odd");
		}
	}

}
