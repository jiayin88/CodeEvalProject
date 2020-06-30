package easyLevel;

public class TestingProblem {
	public static void main(String[]args){
		String line = " QOuoaV |  OaoQVu";
		String[] words = line.split(" \\| ");
		
		int count = 0;
		//finding point mutation
		for(int i=0;i<words[1].length();i++){
			if(words[0].charAt(i) != words[1].charAt(i)){
				count++;
			}
		}
		if(count == 0){System.out.println("Done");}
		else if(count <= 2){System.out.println("Low");}
		else if(count <= 4){System.out.println("Medium");}
		else if(count <= 6){System.out.println("High");}
		else{System.out.println("Critical");}
	}

}
