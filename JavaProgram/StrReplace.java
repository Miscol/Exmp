public class StrReplace{
	public static void main(String args[]){
		String strA = "HelloWorld!";
		
		String strB = strA.replaceAll("l","*");
		System.out.println("将全部l替换为*后:" + strB);
		
		String strC = strA.replaceFirst("l","*");
		System.out.print("将全部l替换为*后:" + strC);
		
	}
}