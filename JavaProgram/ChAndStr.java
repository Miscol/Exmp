public class ChAndStr{
	public static void main(String args[]){
		String str = "HelloWorld!";
		
		char arr[] = str.toCharArray();//���ַ���ת��Ϊ�ַ�����( public char arr[] toCharArray() ); 
		System.out.println("�ַ���ת��Ϊ�ַ���������:" + arr);
		
		String strA = new String(arr,4,6);//ע�����������oWorld  ��ֱ�Ӵӵ��ĸ���ʼ���
		System.out.println( "��������ַ�:" + strA ); //��������ַ� offset��ʼλ��  count������ַ�����  public String(char arr[],int offset,int count)
		
		String strB = new String(arr);
		System.out.println( "���ַ�����ת��Ϊ�ַ��������:" + strB );
		 
		System.out.printf( "���ָ��λ�õ��ַ�:%c",str.charAt(0) );//ע��charAt�������ַ����������ַ�����
		
	}
}