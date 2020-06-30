package moderateLevel;

public class ReverseAndAdd {
	public static void main(String[]args){
		String line = "195";
		//int num = Integer.parseInt(line);
		String line2 = new StringBuilder(line).reverse().toString();
		//int num2 = Integer.parseInt(line2);
		int count = 0;
		while(!line.equals(line2)){
			long num = Long.parseLong(line);
			long num2 = Long.parseLong(line2);
			num = num + num2;
			line = String.valueOf(num);
			line2 = new StringBuilder(line).reverse().toString();
			count ++;
		}
		System.out.println(count + " " + line);
	}
}
