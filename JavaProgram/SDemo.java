public class SDemo{
	public static void main(String args[]){
		String stra = "Hello" ;
		String strb = "Hello" ;
		String strc = new String("Hello");
		String strd = new String("Hello");
		System.out.println( "a��b�ȽϽ��(equals)��" +stra.equals(strb) );  //true
		System.out.println( "a��b�ȽϽ����" + (stra == strb) );  //true 
		System.out.println( "a��c�ȽϽ����" + (stra == strc) );  //false 
		System.out.println( "c��b�ȽϽ����" + (strc == strb) );  //false
		System.out.println("a��JVM�еĵ�ַΪ��" + ( stra.hashCode() ));
		System.out.println("b��JVM�еĵ�ַΪ��" + ( strb.hashCode() ));
		System.out.println("c��JVM�еĵ�ַΪ��" + ( strc.hashCode() ));
		System.out.println( "c��d�ȽϽ����" + (strc == strd) );  //false
	}
	
}