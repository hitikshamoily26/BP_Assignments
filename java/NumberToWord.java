import java.util.*;
class NumberToWord {
  
      static String fun(int n){
 
       String str="";

	String[] units = {" "," One "," Two "," Three "," Four "," Five ",
		" Six "," Seven ",
" Eight "," Nine "," Ten "," Eleven ",
		" Twelve "," Thirteen "," Fourteen "," Fifteen "," Sixteen ",

	        " Seventeen "," Eighteen "," Nineteen "};

	String[] tens = {" "," "," Twenty "," Thirty "," Forty "," Fifty ",
		 " Sixty "," Seventy "," Eighty "," Ninety "};
	
	if(n<20){
 
           str = units[n];
     
  	 }
       
 	else if(n>=20 && n<100){
   
           str = tens[n/10] + units[n%10];
     
   	 }
    
        
   
 	return str;
  
  	}

	static String convert(int num){
 
	       String s = "";
     
 
		  if(num<100){
   
	             s = fun(num);
  
	          }
		  else if(num>=100 && num<1000){
 
                     s = fun(num/100) + " Hundred " +convert(num%100); 
 
                  }
	  	  else if(num>=1000 && num<100000){
   
	             s = fun(num/1000) + " Thousand " +convert(num%1000);

	          }
		  else if(num>=100000 && num<10000000){

	             s = fun(num/100000) + " Lakh " +convert(num%100000);
  
	          }
		  else if(num>=10000000 && num<1000000000){
   
      		     s = fun(num/10000000) + " Crore " +convert(num%10000000);
    
	          }
		  return s;
  
	  }
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number to be converted into words: ");
		int number = s.nextInt();
		
		String word = convert(number);
		
		System.out.println(word);

	}
 
}