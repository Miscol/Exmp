class add{
	private int numA;
	private int numB;
	
	public add(int NA, int NB){
		numA = NA;
		numB = NB;
	}
	/* 注：以下是为了能够在其他类里面能够访问add类里面的numA成员和numB成员而写的方法
	public void setNumA(int NA){
		numA = NA;
	}
	public void setNumB(int NB){
		numB = NB;
	}
	public int getNumA(){
		return numA;
	}
	public int getNumB(){
		return numB;
	}
	*/
	public void Sum(){
		System.out.print("The sum is:" + (numA+numB) );
	}
}

public class Encapsulation{
	public static void main(String args[]){
	add Avg = new add(30,40);

	Avg.Sum();
	}
}

