import java.util.*;
public class CharacterOrNot
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter a character: ");
	    char character = s.next().charAt(0);

	    if ( character>='a' && character<='z' || character>='A' && character<='Z' )
	    {
	        System.out.println(character+ " is an alphabet. ");
	    }
	    else
	    {
	        System.out.println(character+ " is not an alphabet. ");
	    }
	}
}
