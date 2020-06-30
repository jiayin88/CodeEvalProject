package hardLevel;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayWithDNA {
	
	public static int[] toIntArray(List<Integer> list)  {
	    int[] ret = new int[list.size()];
	    int i = 0;
	    for (Integer e : list)  
	        ret[i++] = e.intValue();
	    return ret;
	}
	
	public static ArrayList numberOfPatternOccurence(String pattern, String dna, int mismatch){
		/*This is to find the number of times does a pattern occur in a given string with at most d mismatches
		 * To use:
		 * System.out.println(numberOfPatternOccurence(pattern,dna);
		 * */
		ArrayList<String> list = new ArrayList<String>();
		List<Integer> num = new ArrayList<Integer>();
		int length = pattern.length();
		int dnaLength = dna.length();
		
		char[] dna1 = pattern.toCharArray();
		
		int count = 0;
		for(int i=0; i<=(dnaLength-length);i++){
			String temp = dna.substring(i,i+length);
			char[] dna2 = temp.toCharArray();
			for(int j=0; j<dna1.length;j++){
				if(dna1[j] != dna2[j]){count++;}	
			}
			if(count<=mismatch){
				list.add(temp);
				num.add(count);
			}
			count=0;
		}
		
		int[] arrayNum = toIntArray(num);
		int[] arrayNum2 = toIntArray(num);
		String [] array = list.toArray(new String[list.size()]);
		ArrayList<String> newlist = new ArrayList<String>();
		ArrayList<String> sortlist = new ArrayList<String>();
		
		Arrays.sort(arrayNum);
		int pointer = arrayNum[0];
		for(int i:arrayNum){
			if(pointer != i){
				Collections.sort(newlist);
				pointer = i;
				sortlist.addAll(newlist);
				newlist.clear();
			}
			for(int j=0;j<arrayNum2.length;j++){
				if(arrayNum2[j]==arrayNum[i] && array[j] != ""){
					newlist.add(array[j]);
					array[j] = "";
					arrayNum2[j] = 0;
					break;
				}
			}
			
		}
		sortlist.addAll(newlist);
		
		return newlist;
	}
	
	public static void main(String[] args) throws IOException{
		 File file = new File("meow.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            String[] sequence = line.split("\\s");
	            String pattern = sequence[0];
	            int mismatch = Integer.parseInt(sequence[1]);
	            
	            ArrayList<String> result = numberOfPatternOccurence(pattern,sequence[2],mismatch);
	            
	            String join = "";
	     	   	for(String str: result){
	     			join = join + str + " ";
	     	   	}
	     	   	if(join.isEmpty()){System.out.println("No match");}
	     	   	else{System.out.println(join.trim());}
	     	   	
	        }
	        buffer.close();
	}

}
