//3. Write a Java program to find simple interests.
package Assignment_1;
import java.util.*;
public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float P=sc.nextFloat();
        System.out.println("Enter Rate: ");
        float r=sc.nextFloat();
        System.out.println("Enter Time: ");
        float t=sc.nextFloat();
        
        float si=((P*r*t)/100);
        System.out.print("Simple intrest is = "+si);
              
        }
}
