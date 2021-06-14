import java.util.*;
public class SpecificWordCount
{
    static int WordCount(String str, String word){
        int count = 0;
        String para[]=str.split(" ");
        for(int i=0;i<para.length;i++){
            if(word.equals(para[i])){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sentence or paragraph: ");
		String str = s.nextLine();
		System.out.println("Enter the word whose frequecy you want to search: ");
		String word = s.next();
		int frequency=WordCount(str,word);
		System.out.println("The "+word+" occurs "+frequency+" times.");
		
	}
}
