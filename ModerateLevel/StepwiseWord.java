package moderateLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StepwiseWord {
	public static void main(String[]args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        int c = 0;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            //String line = "stop play eat";
	            if(c == 0){ //this part is basically to avoid the last line to be a new line. nothing much
	            	c++;
	            }else{
	            	System.out.println();
	            }
	            
	            //split it by " "
	            String[] words = line.split(" ");
			//initialize longest string and pointer to the first word
			int max = words[0].length();
			int pt = 0;
		
			//find the longest word
			for(int i=1;i<words.length;i++){
				if(words[i].length()> max){
					max = words[i].length();
					pt = i;
				}
			}
		
			//print out the longest word
			System.out.print(words[pt].charAt(0) + " ");
			String pos = "*";
			for(int i=1;i<words[pt].length()-1;i++){
				System.out.print(pos + words[pt].charAt(i) + " ");
				pos = pos + "*";
			}
			System.out.print(pos + words[pt].charAt(words[pt].length()-1));
			//System.out.println();
	    }
	}
}
