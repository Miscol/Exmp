public class Fibonaqi(){
	
	public static void main(String args[]){
		
		int i;
		int arr[100]={1,1,2};
		
		for(i=3;i<20;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
			for(i=1;i<20;i++){
				System.out.println("斐波那契数列第" +i +"项为:"+arr[i] );
			}
		
	}
}