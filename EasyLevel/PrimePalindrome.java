package easyLevel;

import java.util.ArrayList;

public class PrimePalindrome {
	static boolean primeNumber(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		ArrayList<String> numbers = new ArrayList<String>();
		for(int i=900;i<1000;i++){
			if(primeNumber(i)){
				numbers.add(String.valueOf(i));
			}
		}
		
		String temp = numbers.get(0);
		for(String elem: numbers){
			String t = new StringBuilder(elem).reverse().toString();
			if(elem.equals(t)){
				temp = elem;
			}
		}
		System.out.println(temp);
	}
}
