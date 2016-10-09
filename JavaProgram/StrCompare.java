public class StrCompare{
	public static void main(String args[]){
		String strA = "helloworld!";
		String strB = "HelloWorld!";
		
		System.out.println(strA.equals(strB));
		System.out.println(strA.equalsIgnoreCase(strB));
		
		int temp = strA.compareTo(strB);
		System.out.println(temp);
	}
}