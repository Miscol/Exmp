import java.util.*;
public class ByteAndStr{
	public static void main(String args[]){
		byte arr[] = new byte[5];
		Scanner scanf = new Scanner(System.in);
		System.out.printf("�������������:");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = scanf.nextByte();
		}
		
		String strA = new String(arr);
		System.out.printf("���ֽ�����ת��Ϊ�ַ���:%s\n",strA);
		
		String strB = new String(arr,2,3);
		System.out.printf("���ֽ�����Ĳ��ֳ�Աת��Ϊ�ַ���:%s\n",strB);
		
		String strC = "HelloWorld!";
		byte arrA[] = strC.getBytes();//���ַ���ת��Ϊ�ֽ�����
		System.out.printf("�ַ���ת��Ϊ�ֽ���������ݺ�:");
		for(int j = 0 ; j < arrA.length ; j++){
		System.out.printf( "%s%d",j==0?"":" ",arrA[j]);
		}
		
        
		
	}
}