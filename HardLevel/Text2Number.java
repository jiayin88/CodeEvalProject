package hardLevel;

import java.util.Hashtable;

public class Text2Number {
	
	public static void main(String[]args){
		//create a hashtable to store numbers
		Hashtable<String, Integer> alphaNum = new Hashtable<String, Integer>();
		
		alphaNum.put("ze", 0); alphaNum.put("on", 1); alphaNum.put("tw", 2); alphaNum.put("th", 3);
		alphaNum.put("fo", 4); alphaNum.put("fi", 5); alphaNum.put("si", 6); alphaNum.put("se", 7);
		alphaNum.put("ei", 8); alphaNum.put("ni", 9); alphaNum.put("te", 10); alphaNum.put("el", 11);
		alphaNum.put("twelve", 12); 
		
		String line = "negative sixty seven thousand"; //-67000
		//split it by " "
		String[] words = line.split(" ");
		int control = 1;
		int total = 0;
		int num = 0;
		int c = 0;
		int million = 0;
		int thousand = 0;
		
		for(int i=0;i<words.length;i++){
			if(words[i].equals("negative")){//check for negative number
				control = -1;
				num = alphaNum.get(words[i+1].substring(0,2));
				continue;
			}
			if(words[i].equals("twelve")){
				num = alphaNum.get(words[i]);
				total = total + num;
				continue;
			}else{
				String temp = words[i].substring(0,2);
				String temp2 = words[i].substring(words[i].length()-3);
				if(temp2.equals("een")){ //for all the teen numbers
					num = alphaNum.get(temp);
					total = total + (num+10);
				}else if(temp2.equals("nty") || words[i].substring(words[i].length()-2).equals("ty")){
					num = alphaNum.get(temp);
					total = total + (num*10);
				}else if(temp2.equals("red")){ //for all hundreds
					if(million == 0 || thousand == 0){
						total = total +(num*100);
					}else{
						total = num*100;
					}
					c = 0;
				}else if(temp2.equals("and")){ //for all thousands
					if(thousand == 0 && c == 0){
						num = total;
						total = num*1000;
					}else if(thousand == 0 && c != 0){
						total = total + num;
						num = total;
						total = num*1000;
						c = 0;
					}else{
						total = total + (num*1000);
						c = 0;
					}
					thousand = total;
					total = 0;
				}else if(temp2.equals("ion")){ //for all millions
					if(million == 0 && c == 0){
						num = total;
						total = num*1000000;
						c = 0;
					}else if(million == 0 && c != 0){
						total = total + num;
						num = total;
						total = num*1000000;
						c = 0;
					}else{
						total = total + (num*1000000);
						c = 0;
					}
					million = total;
					total = 0;
				}else if(i == words.length-1){
					num = alphaNum.get(temp);
					total = total + num;
				}else{
					num = alphaNum.get(temp);
					c++;
				}
			}
		}
		
		int result = thousand + million + total;
		if(control == -1){
			System.out.println(-1*result);
		}else{
			System.out.println(result);
		}
	}
}
