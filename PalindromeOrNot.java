import java.util.*;

public class PalindromeOrNot
{
 
   static boolean isPalindrome(String str){
   
     int i = 0,j = str.length()-1;
  
    
     while(i<j){
           
 	if(str.charAt(i)!=str.charAt(j))
       
         return false;
            
     
     i++;
    
     j--;
    
    }
 
     
  return true;
  
  }
    
	
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	
	    System.out.println("Enter a String to check whether it is palindrome or not");
	
	    String word = s.next();

		
		
	    if(isPalindrome(word)){
		 
   		System.out.println(word+ " is a palindrome.");
	
	    }
		
	    else{
		   
            System.out.println(word+ " is not a palindrome.");
	
	    }

	
	}

}
