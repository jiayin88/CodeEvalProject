package easyLevel;

public class NotSoClever {
	public static void main(String[]args){
		String line = "5 4 3 2 1 | 2";
		//separate by " | "
		String[] numbers = line.split(" \\| ");
		//get the number of iteration needed
		int iter = Integer.parseInt(numbers[1]);
		//separate by " "
		String[] result = numbers[0].split(" ");
		for(int i=0;i<iter;i++){
			for(int j=0;j<result.length-1;j++){
				int num1 = Integer.parseInt(result[j]);
				int num2 = Integer.parseInt(result[j+1]);
				if(num2 < num1){
					String temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
					break;
				}
			}
		}
		for(int i=0; i<result.length-1;i++){
			System.out.print(result[i] + " ");
		}
		System.out.print(result[result.length-1] + "\n");
	}
}
