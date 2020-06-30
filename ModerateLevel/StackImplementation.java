package moderateLevel;

import java.io.*;
import java.util.Stack;

public class StackImplementation {
	 public static void main (String[] args) throws IOException {
	        File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        int c = 0;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            Stack st = new Stack();
	            if(c == 0){ //this part is basically to avoid the last line to be a new line. nothing much
	            	c++;
	            }else{
	            	System.out.println();
	            }
			
	            //String line = "10 -2 3 4"; --> sample input
	            //Output: 4 -2
	            //to split it accordingly. easier to see
	            String[] stackNum = line.split(" ");
	            //use loop
			
	            for(int i=0;i<stackNum.length;i++){
	            	st.push(stackNum[i]);
	            }
	            for(int i=0;i<stackNum.length;i++){
	            	if(i%2 == 0){
	            		System.out.print(st.pop());
	            	}else{
	            		st.pop();
	            		if((i+1)!= stackNum.length){
	            			System.out.print(" ");
	            		}
	            	}
	            }

	        }
	    }
}
