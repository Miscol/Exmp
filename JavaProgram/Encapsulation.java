class add{
	private int numA;
	private int numB;
	
	public add(int NA, int NB){
		numA = NA;
		numB = NB;
	}
	/* ע��������Ϊ���ܹ��������������ܹ�����add�������numA��Ա��numB��Ա��д�ķ���
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

