import java.util.*;
public class StrDemo{
	public static void main(String args[]){
		Scanner scanf = new Scanner(System.in);
		System.out.print("�������ַ�:");
		String str = scanf.nextLine();
		int flag = 0;
		char arr[] = str.toCharArray();
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]<'9' && arr[i]>'0'){
				flag++;
			}
		}
		
		System.out.print("���ַ����а��������ָ���Ϊ:" + flag);
	}
}