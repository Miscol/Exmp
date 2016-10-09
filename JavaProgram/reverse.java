import java.util.*;
public class reverse{
	public static void main(String args[]){
		int arr[] = new int[10];
		Scanner scanf = new Scanner(System.in);
		System.out.print("请输入十个整数:");
		for(int j=0;j<arr.length;j++){
			arr[j] = scanf.nextInt();
			
		}
			rev(arr);
			printf(arr);
	}
	
	public static void printf(int arr[]){
		System.out.print("倒置后为:");
		for(int i=0;i<arr.length;i++){
			System.out.print( (i==0?"":",") + arr[i] );
		}
	}
	
	public static void rev(int arr[]){
		int frequency = arr.length/2;
		int head = 0;
		int tail = arr.length - 1;

		for(int i =0 ; i<frequency ; i++){
			int temp = arr[tail] ;
			arr[tail] = arr[head];
			arr[head] = temp;
			head++;
			tail--;
			
			}
		}
    }
	