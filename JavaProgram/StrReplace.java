public class StrReplace{
	public static void main(String args[]){
		String strA = "HelloWorld!";
		
		String strB = strA.replaceAll("l","*");
		System.out.println("��ȫ��l�滻Ϊ*��:" + strB);
		
		String strC = strA.replaceFirst("l","*");
		System.out.print("��ȫ��l�滻Ϊ*��:" + strC);
		
	}
}