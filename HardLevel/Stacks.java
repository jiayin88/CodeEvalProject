package hardLevel;

import java.text.DecimalFormat;
import java.util.EmptyStackException;
import java.util.Stack;

//for prefix expression
public class Stacks {
	
	public static void main(String[]args){
		DecimalFormat df = new DecimalFormat("####");
		Stack st = new Stack();
		
		String line = "- * + 1 2 3 * - 4 5 + 6 7";
		//to split it accordingly. easier to see
		String[] stackNum = line.split(" ");
		//System.out.println(stackNum[stackNum.length-1]);
		//to put it into stack. push until reach num num operator, then pop out
		//use loop
		
		for(int i=stackNum.length-1;i>=0;i--){
			if(stackNum[i].equals("*") || stackNum[i].equals("-") || stackNum[i].equals("+") || stackNum[i].equals("/")){
				double num1 = (Double) st.pop();
				double num2 = (Double) st.pop();
				if(stackNum[i].equals("*")){
					st.push(num1*num2);
				}
				else if(stackNum[i].equals("/")){
					st.push(num1/num2);
				}
				else if(stackNum[i].equals("+")){
					st.push(num1+num2);
				}
				else if(stackNum[i].equals("-")){
					st.push(num1-num2);
				}else{}
			}else{
				double num = Double.parseDouble(stackNum[i]);
				st.push(num);
			}
		}
		System.out.println(df.format(st.pop())); //Output: 22
	}

}
