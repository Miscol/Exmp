import java.util.*;
public class AllStrWayTest{
	public static void main(String args){
		Scanner scanf = new Scanner(System.in);
		String str = scanf.nextLine();
		char arr[] = str.toCharArray();
		
		int result[] = new int[str.length()];
		for(i = 0;i < str.length();i++){
			result[i] = arr[i] - '0';
			System.out.print((i==0?"":" ") + result[i]);
		}
	}
}