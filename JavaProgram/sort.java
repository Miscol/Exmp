import java.util.Scanner;
import java.util.Arrays;
class sort{
	public static void main(String args[]){
		Scanner scanf = new Scanner(System.in);
		int i = 0;
		int arr[] = new int[10];
		System.out.println("������Ҫ���������:");
		for(;i<=9;i++){
			arr[i] = scanf.nextInt();
		}
		Arrays.sort(arr);//
		
		for(i=9;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
	}
}