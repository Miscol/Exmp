//测试结果为   break 以及 continue都只会影响当前的循环  不会影响其他循环
class TestBreak{
	public static void main(String args[]){
		int x,y;
		for(x=1;x<=9;x++){
			for(y=1;y<=x;y++){
				if(y==3){
					
				}
				System.out.print( + x + " * " + y + " = " + x*y + "\t" );
			}
			System.out.print("\n");
		}
	}
}