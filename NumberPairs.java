package easyLevel;

public class NumberPairs {
	public static void main(String[]args){
		String line = "2,4,5,6,9,11,15;20"; //Output: 5,15;9,11
		//split it by ";"
		String[] factors = line.split(";");
		//now got 2 arrays. further split the first one by ","
		String[] numbers = factors[0].split(",");
		//convert the factors[1] to integer
		int expected = Integer.parseInt(factors[1]);
		String result = "";
		//loop through to get your result
		for(int i=0;i<numbers.length-1;i++){
			int num = Integer.parseInt(numbers[i]);
			int sum = 0;
			for(int j=i+1;j<numbers.length;j++){
				int num2 = Integer.parseInt(numbers[j]);
				if(num+num2 == expected){
					result = result + numbers[i] + "," + numbers[j] + ";";
					break;
				}
			}
		}
		//display result
		if(result.equals(""))
			System.out.println("NULL");
		else{
			if(result.charAt(result.length()-1) == ';')
				System.out.println(result.substring(0,(result.length()-1)));
			else
				System.out.println(result);
		}
	}
}
