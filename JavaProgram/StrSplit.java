public class StrSplit{
	public static void main(String args[]){
		String str = "张三:20|李四:21|王麻子:22";
		
		String temp[] = str.split("\\|");
		for(int i = 0 ; i<temp.length ; i++){
			System.out.printf("这是temp数组第%d个数据:%s\n",i,temp[i]);
		}
		
		System.out.println("数组temp的长度为:" + temp.length);
		
		for(int j = 0; j<temp.length ; j++){//此循环为输出次数
			String result[] = temp[j].split(":");//一个temp元素拆分成两个元素  存入result数组中 即0 1
			System.out.printf("姓名为:%s,年龄为:%s\n",result[0],result[1]);
		}
	}
}