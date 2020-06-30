package easyLevel;


public class CountingPrimes {
	public static void main(String[]args){
		//find the sum of first 1000 prime numbers
		String line = "2,13"; //output: 4
		String[] splitNum = line.split(",");
		int n1 = Integer.parseInt(splitNum[0]);
		int n2 = Integer.parseInt(splitNum[1]);
		int count = 0;
		for(int i=n1;i<=n2;i++){
			if(primeNumber(i)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean primeNumber(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
