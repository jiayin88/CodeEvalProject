package easyLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringsAndArrows {
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        String pattern1 = "<--<<";
	        String pattern2 = ">>-->";
	        int length = pattern1.length();
	        int count = 0;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            int lineLength = line.length();
	            // Process line of input Here
	            for(int i=0;i<=(lineLength-length);i++){
	            	String temp = line.substring(i,i+length);
	            	if(temp.equals(pattern1)|| temp.equals(pattern2)){
	            		count++;
	            	}
	            }
	            System.out.println(count);
	            count = 0;
	        }
	        buffer.close();
	}
}
