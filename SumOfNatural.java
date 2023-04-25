//7.Java Program to Find Sum of Natural Numbers.
package Assignment_1;
import java.util.*;
public class SumOfNatural {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print("Sum of First "+n+ " Is Number : "+sum);
	}

}
