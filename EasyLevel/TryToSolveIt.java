package easyLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryToSolveIt {
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            String temp = "";
	            for(int i=0;i<line.length();i++){
	            	char ch = line.charAt(i);
	            	int num = (int)ch;
	            	if(num<=102){temp = temp + Character.toString((char)(num+20));}
	            	else if(num>=103 && num<=109){temp = temp + Character.toString((char)(num+7));}
	            	else if(num>=110 && num<=116){temp = temp + Character.toString((char)(num-7));}
	            	else{temp = temp + Character.toString((char)(num-20));}
	            }
	            System.out.println(temp);
	        }
	        buffer.close();
	}
}
