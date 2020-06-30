package easyLevel;

import java.io.*;

public class ReverseWords {

	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            if(!line.equals("")){
	            	String [] array = line.split(" ");
	            	for(int i=(array.length-1);i>0;i--){
	            		System.out.print(array[i] + " ");
	            	}
	            	System.out.print(array[0]+"\n");
	            }
	        }
	        buffer.close();
	        
	}
}
