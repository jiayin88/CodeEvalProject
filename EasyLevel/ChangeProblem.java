package easyLevel;

public class ChangeProblem {
	public static void main(String[]args){
		String line = "13";
		int number = Integer.parseInt(line);
		int[] arrayChange = {5,3,1};
		
		//to identify the highest change
		int highest = 0;
		for(int i : arrayChange){
			if(i > highest)
				highest = i;
		}
		
		//to find the change for the first few where result >= highest/2
		int min = Math.floorDiv(highest, 2);
		int ptChange = 0; //act as a pointer
		int resultChange = number; //set it to the biggest change needed
		int checkEven = number;
		int c = 0;

		if(number == 1 || number == 3 || number == 5){
			//if change is the minimum, just print out 1 and exit the whole thing
			System.out.println(1);
			System.exit(0);
		}
		for(int i : arrayChange){
			if(i >= min){
				int temp = Math.floorDiv(number, i);
				if((number%i) == 0 && c == 0){
					//if the min coin needed can get straight by 1,3,5, c++
					checkEven = number/i;
					c++;
				}else{
					if(temp <= resultChange){
						ptChange = i;
						resultChange = Math.floorDiv(number, i);
					}
				}
			}
		}
		
			int balance = number - (ptChange * resultChange);
			//System.out.println("Current balance :" + balance);
			//System.out.println("Current change value :" + resultChange);
			//identify the pointer's value in the arrayChange
			//kind of loop for each change to get balance
			for(int i : arrayChange){
				if(i == ptChange || (balance + i) == number || (balance + i) > number){
					continue;
				}
				else{
					if(balance%i == 0){
						resultChange = resultChange + balance/i;
						break;
					}else{
						int temp = Math.floorDiv(balance, i);
						resultChange = resultChange + temp;
						balance = balance - (temp*i);
					}
				}
			}
			if(checkEven < resultChange){
				System.out.println(checkEven);
			}else{
				System.out.println(resultChange);
			}
	}
}
