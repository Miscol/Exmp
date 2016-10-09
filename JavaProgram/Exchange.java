public class Exchange{
	public static void main(String args[]){
		int x,y,temp;
		
		x=10;y=20;
		System.out.println("交换前: x = " + x + ", y = " + y );
		
		temp = x ;
		x = y;
		y = temp;
		
		System.out.println("交换后: x = " + x + ", y = " + y );
		
	}
}