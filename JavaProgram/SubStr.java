public class SubStr{
	public static void main(String args[]){
		String strA = "HelloWorld!";
		
		String strB = strA.substring(5);//�ӵ������ʼ ֱ�����һ��
		String strC = strA.substring(0,6);//�ӵ�һ����ʼ ��ȡ��������
		
		System.out.printf("strB=%s\nstrC=%s",strB,strC);
	}
}