public class SubStr{
	public static void main(String args[]){
		String strA = "HelloWorld!";
		
		String strB = strA.substring(5);//从第五个开始 直到最后一个
		String strC = strA.substring(0,6);//从第一个开始 截取到第六个
		
		System.out.printf("strB=%s\nstrC=%s",strB,strC);
	}
}