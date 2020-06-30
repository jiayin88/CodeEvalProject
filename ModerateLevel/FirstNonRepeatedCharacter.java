package moderateLevel;

public class FirstNonRepeatedCharacter {
	public static void main(String[]args){
		String line = "tooth";
		//String result = line.replaceAll("[^a-zA-Z]","");
		//split it by ""
		String[] splitLetters = line.split("");
		for(int i=0;i<splitLetters.length;i++){
			int count = 0;
			if(splitLetters[i].equals("")){
				continue;
			}
			for(int j=i+1;j<splitLetters.length;j++){
				//System.out.println(splitLetters[i] + " " + splitLetters[j]);
				if(splitLetters[i].equals(splitLetters[j])){
					splitLetters[j] = "";
					count++;
				}
			}
			//System.out.println(count);
			if(count == 0){
				System.out.print(splitLetters[i]);
				break;
			}
		}
		System.out.println();
	}
}
