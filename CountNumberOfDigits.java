import java.util.*;
public class CountNumberOfDigits
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    long countDigits = 0;
	    System.out.println("Enter a number of digits: ");
	    long num = s.nextInt();
	    while(num!=0){
	        num = num/10;
	        countDigits++;
	    }
	    System.out.println("Number of digits are "+countDigits);
	}
}
