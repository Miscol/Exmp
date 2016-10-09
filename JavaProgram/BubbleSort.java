import java.util.*;
public class BubbleSort{
	public static void main(String args[]){
		Scanner scanf = new Scanner(System.in);
		int arr[] = new int[10];
		int temp;
		
		System.out.print("请输入十个整数:");
		for(int p=0 ; p<arr.length ; p++){
			arr[p] = scanf.nextInt();
		}
		
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if( arr[i]< arr[j] ){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("排序后为:");
		for(int p=0;p<arr.length;p++){
			System.out.print( (p==0?"":",") + arr[p] );
		}

		}
	}