public class StrSearch{
	public static void main(String args[]){
		String strA = "HelloWorld";
		
		if(strA.contains("hello")){//区分大小写的，输出没有
			System.out.printf("字符串内有此内容");
		}else{
			System.out.printf("没有\n");
		}
		
		System.out.printf("strA中e的索引为:%d\n",strA.indexOf("e"));//蘑菇字符串的索引
		
		System.out.printf("strA中l的索引为:%d\n",strA.indexOf("l",3));
		
		System.out.printf("strA中e的索引为(从后往前查找):%d\n",strA.lastIndexOf("e"));
		
		System.out.printf("strA中l的索引为(从后往前查找):%d\n",strA.lastIndexOf("l",4));
		
		if(strA.startsWith("hel")){//不是
			System.out.printf("字符串是这样开头的");
		}else{
			System.out.printf("不是\n");
		}
		
		if(strA.endsWith("rld")){//
			System.out.printf("字符串是这样开头的");
		}else{
			System.out.printf("不是\n");
		}
		
		
	}
}