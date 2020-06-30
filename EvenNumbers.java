package easyLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EvenNumbers {
	public static void main(String[] args){
		String line = "13";
		int num = Integer.parseInt(line);
     	String result = Integer.toBinaryString(num);
     	int c = 0;
     	for(int i=0;i<result.length();i++){
     		if(result.charAt(i)== '0'){
     			c++;
     		}
     	}
     	System.out.println(result.length()-c);
	}
}
