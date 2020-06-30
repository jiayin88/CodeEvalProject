package easyLevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BinaryZero {
	public static void main(String[]args){
		String line = "2 4";
		String[] temp = line.split(" ");
		int [] num = new int[2];
		num[0] = Integer.parseInt(temp[0]);
		num[1] = Integer.parseInt(temp[1]);
		Pattern pattern = Pattern.compile("0");
		int count = 0;
		for(int i=1;i<=num[1];i++){
			String binary = Integer.toBinaryString(i);
			Matcher matcher = pattern.matcher(binary);
			 int c = 0;
			 int pos = 0;
			 while (matcher.find(pos))
			 {
			      c++;
			      pos = matcher.start() + 1;
			 }
			 if(c == num[0]){count++;}
		}
		System.out.println(count);
	}
}
