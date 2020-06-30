package easyLevel;

import java.util.ArrayList;

public class SumPrimeNumbers {
	public static void main(String[]args){
		//find the sum of first 1000 prime numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		int total = 10;
		int i = 5;
		while(numbers.size()<1000){
			i = i+2;
			//System.out.println(i);
			int count = 0;
			for(int elem : numbers){
				if(i%elem != 0){
				   count++;
				}
			}
			if(count == numbers.size()){
				//System.out.println(i);
				numbers.add(i);
				total = total + i;
			}
		}
		
		System.out.println(total);
	}
}
