package moderateLevel;

public class TrailingString {
	public static void main(String[]args){
		String line = "abc,abc ";
		if(line.equals("")){
			System.out.println("NULL");
			System.exit(0);
		}
		//separate by ","
		String[] words = line.split(",");
		int length = words[1].length();
		int l = words[0].length();
		if(length < l){
			String substring = words[0].substring(l-length,l);
			if(substring.equals(words[1]))
				System.out.println(1);
			else
			System.out.println(0);
		}else{
			System.out.println(0);
		}
	}
}
