import java.util.*;
public class PerfectNumbers
{
    static boolean CheckPerfectNumber(int num){
	    int sum=0;
	    for(int i = 1;i <num;i++){
	        if(num%i==0){
	            sum = sum + i;
	        }
	    }
	    if(sum==num)
	        return true;
	    else
	        return false;
	    }

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the nth number to print all Perfect numbers: ");
	    int number = s.nextInt();
	    for (int i=1;i<=number;i++){
	        if(CheckPerfectNumber(i))
	            System.out.println(i);
	    }	    
}
}
