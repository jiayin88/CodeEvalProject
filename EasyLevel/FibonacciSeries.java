package easyLevel;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class FibonacciSeries {
	
	public static void main(String[]args) throws IOException{
		 //File file = new File("meow.txt");
		 File file = new File(args[0]);
	     BufferedReader buffer = new BufferedReader(new FileReader(file));
	     ArrayList<String> sequence = new ArrayList<String>(); //put into a list 
	     DecimalFormat df = new DecimalFormat("#####");
	     String line;
	     while ((line = buffer.readLine()) != null) {
	         line = line.trim();
	            // Process line of input Here
	            sequence.add(line);
	     }
	     buffer.close();
	        
	     //convert it into an array
	     String [] array = sequence.toArray(new String[sequence.size()]);
	     int [] num = new int[array.length];
	     int max = 0;
	     for(int i=0;i<num.length;i++){
	    	 num[i] = Integer.parseInt(array[i]);
	    	 if(num[i]>= max){ max = num[i];}
	     }
	     
	     //to do the fibonacci numbers
	     double [] fibo = new double[max+1];
	     fibo[0] = 0;
	     fibo[1] = 1;
	     for(int i=2;i<fibo.length;i++){
	    	 fibo[i] = fibo[i-1] + fibo[i-2];
	     }
	     
	     for(int i : num){
	    	 System.out.println(df.format(fibo[i]));
	     }
	}

}
