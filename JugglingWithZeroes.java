package easyLevel;

import java.math.BigInteger;

public class JugglingWithZeroes {
	public static void main(String[]args){
		String line = "0 000000 0 0 0 000 0 00 0 0 0 000 0 0000 0 00 0 0000 0 0000 0 0 0 00 0 0 0 00 0 000 0 000 0 000 0 00000 0 0 0 000 0 0000 0 0 0 00000 00 00 0 0 00 0 0 0000 00 0 0 0 00 00 0 0 00 00 0 0 00 000 0 0 00 00 0 00 00 00 0 000 00 0 0 0 00 0";
		//split by " "
		String[]word = line.split(" ");
		String decode = "";
		for(int i=0;i<word.length;i=i+2){
			if(word[i].equals("0")){
				decode = decode + word[i+1];
			}else{
				word[i+1] = word[i+1].replace("0", "1");
				decode = decode + word[i+1];
			}
		}
		System.out.println(Long.parseLong(decode,2));
		//System.out.println(Integer.parseInt(decode,2)); --> big values won't work because int value only 32 bits
	}
}
