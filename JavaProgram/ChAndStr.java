public class ChAndStr{
	public static void main(String args[]){
		String str = "HelloWorld!";
		
		char arr[] = str.toCharArray();//将字符串转化为字符数组( public char arr[] toCharArray() ); 
		System.out.println("字符串转化为字符数组后输出:" + arr);
		
		String strA = new String(arr,4,6);//注意这里输出是oWorld  即直接从第四个开始输出
		System.out.println( "输出部分字符:" + strA ); //输出部分字符 offset起始位置  count输出的字符数量  public String(char arr[],int offset,int count)
		
		String strB = new String(arr);
		System.out.println( "将字符数组转化为字符串后输出:" + strB );
		 
		System.out.printf( "输出指定位置的字符:%c",str.charAt(0) );//注意charAt是用于字符串而不是字符数组
		
	}
}