public class Exchange{
	public static void main(String args[]){
		int x,y,temp;
		
		x=10;y=20;
		System.out.println("����ǰ: x = " + x + ", y = " + y );
		
		temp = x ;
		x = y;
		y = temp;
		
		System.out.println("������: x = " + x + ", y = " + y );
		
	}
}