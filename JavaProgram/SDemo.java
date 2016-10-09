public class SDemo{
	public static void main(String args[]){
		String stra = "Hello" ;
		String strb = "Hello" ;
		String strc = new String("Hello");
		String strd = new String("Hello");
		System.out.println( "a与b比较结果(equals)：" +stra.equals(strb) );  //true
		System.out.println( "a与b比较结果：" + (stra == strb) );  //true 
		System.out.println( "a与c比较结果：" + (stra == strc) );  //false 
		System.out.println( "c与b比较结果：" + (strc == strb) );  //false
		System.out.println("a在JVM中的地址为：" + ( stra.hashCode() ));
		System.out.println("b在JVM中的地址为：" + ( strb.hashCode() ));
		System.out.println("c在JVM中的地址为：" + ( strc.hashCode() ));
		System.out.println( "c与d比较结果：" + (strc == strd) );  //false
	}
	
}