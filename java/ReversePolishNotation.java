import java.util.*;
import java.io.*;

class EvaluatePolishNotation{
    public int evaluate(String exp[]){
        Stack<String> stack = new Stack<String>();
        int x,y,value=0;
        String result="";
        String choice;
        String str="";
        
        for(int i=0;i<exp.length;i++){
            
            if(exp[i]!="+" && exp[i]!="-" && exp[i]!="*" && exp[i]!="/" ){
                stack.push(exp[i]);
                continue;
            }
            else{
                choice = exp[i];
            }
            
            switch(choice){
                case "+": x = Integer.parseInt(stack.pop());
                          y = Integer.parseInt(stack.pop());
                          value = x + y;
                          result=str + value;
                          stack.push(result);
                break;
                
                case "-": x = Integer.parseInt(stack.pop());
                          y = Integer.parseInt(stack.pop());
                          value = x - y;
                          result= str + value;
                          stack.push(result);
                break;
                
                case "*": x = Integer.parseInt(stack.pop());
                          y = Integer.parseInt(stack.pop());
                          value = x * y;
                          result=str + value;
                          stack.push(result);
                break;
                
                case "/": x = Integer.parseInt(stack.pop());
                          y = Integer.parseInt(stack.pop());
                          value = y / x;
                          result=str + value;
                          stack.push(result);
                break;
                
            default:
                    continue;
                         
            }
        }
        return Integer.parseInt(stack.pop());
         
    }
}

public class ReversePolishNotation
{
	public static void main(String[] args) {
		String expressionArray[] = {"5","4","3","+","2","*"};
		
		EvaluatePolishNotation obj = new EvaluatePolishNotation();
		int Expression_Result = obj.evaluate(expressionArray);
		System.out.println("The reverse polish notation of this expression is: " +Expression_Result);
	}
}
