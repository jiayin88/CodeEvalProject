package moderateLevel;

public class PrimeNumbers {
	static boolean primeNumber(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[]args){
		String line = "23";
		int num = Integer.parseInt(line);
		String word = "";
		for(int i=2;i<num;i++){
			if(primeNumber(i)){
				word = word + i + ",";
			}
		}
		System.out.println(word.substring(0,word.length()-1));
	}
}
