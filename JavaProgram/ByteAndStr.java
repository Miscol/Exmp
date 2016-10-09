import java.util.*;
public class ByteAndStr{
	public static void main(String args[]){
		byte arr[] = new byte[5];
		Scanner scanf = new Scanner(System.in);
		System.out.printf("请输入五个整数:");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = scanf.nextByte();
		}
		
		String strA = new String(arr);
		System.out.printf("将字节数组转化为字符串:%s\n",strA);
		
		String strB = new String(arr,2,3);
		System.out.printf("将字节数组的部分成员转换为字符串:%s\n",strB);
		
		String strC = "HelloWorld!";
		byte arrA[] = strC.getBytes();//将字符串转化为字节数组
		System.out.printf("字符串转换为字节数组的内容后:");
		for(int j = 0 ; j < arrA.length ; j++){
		System.out.printf( "%s%d",j==0?"":" ",arrA[j]);
		}
		
        
		
	}
}