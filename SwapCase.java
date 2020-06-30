package easyLevel;

import java.io.*;

public class SwapCase {
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	        	line.trim();
	            // Process line of input Here
	        	int num = Integer.parseInt(line);
	        	String result = Integer.toBinaryString(num);
	        	int count = 0;
	        	for(int i=0;i<result.length();i++){
	        		if(result.charAt(i)== '1'){
	        			count++;
	        		}
	        	}
	        	System.out.println(count);
	        }
	        buffer.close();
	}
}
