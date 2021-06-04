import java.util.*;
public class Total_Occurrences_OfEachDigit {  
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter the number"); 
    int number = scanner.nextInt(); 
  
    int[] digitArray = new int[10]; 
    int remainder = 0; 
  
    while (number > 0) { 
    
    remainder = number % 10; 
    digitArray[remainder]++; 
    number = number / 10; 
  } 
  System.out.println("-------------------------"); 
  System.out.println("Number\tOccurrences"); 
  System.out.println("-------------------------"); 
  
  for (int counter = 0; counter < digitArray.length; counter++) { 
    
    int digitCount = digitArray[counter]; 
    if (digitCount != 0) { 
      System.out.println(counter+ " -> " + "\t" + digitCount); 
    } 
  } 
}
}  