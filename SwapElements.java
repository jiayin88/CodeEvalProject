package easyLevel;

public class SwapElements {
	public static void main(String[]args){
		String line = "1 2 3 4 5 6 7 8 9 10 : 0-1, 1-3";
		//split it by " : "
		String[] splitNum = line.split(" : ");
		//split the second one by ", "
		String[] swap = splitNum[1].split(", ");
		//split the first one by " "
		String[] words = splitNum[0].split(" ");
		//perform swapping
		for(int i=0;i<swap.length;i++){
			String[] numbers = swap[i].split("-");
			int num1 = Integer.parseInt(numbers[0]);
			int num2 = Integer.parseInt(numbers[1]);
			String w = words[num1];
			words[num1] = words[num2];
			words[num2] = w;
		}
		for(int i=0;i<words.length;i++){
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}
}
