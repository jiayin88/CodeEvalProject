package easyLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumOfDigits {
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            int total = 0;
	            String[] array = line.split("");
	            for(int i=0;i<array.length;i++){
	            	int temp = Integer.parseInt(array[i]);
	            	total = total + temp;
	            }
	            System.out.println(total);
	        }
	        buffer.close();

	}
}
