package easyLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestLines {
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String first = buffer.readLine();
	        int num = Integer.parseInt(first);
	        String line;
	        ArrayList<String> sequence = new ArrayList<String>(); 
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            sequence.add(line);
	        }
	        buffer.close();
	        String [] array = sequence.toArray(new String[sequence.size()]);
	        int [] arrayLength = new int[array.length];
	        for(int i=0;i<array.length;i++){
	        	arrayLength[i] = array[i].length();
	        }
	        Arrays.sort(arrayLength);
	        
	        for(int i=(arrayLength.length-1);i>(arrayLength.length-num-1);i--){
	        	for(int j=0;j<array.length;j++){
	        		if(array[j].length() == arrayLength[i]){
	        			System.out.println(array[j]);
	        			break;
	        		}
	        	}
	        }
	}
}
