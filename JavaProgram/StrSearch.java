public class StrSearch{
	public static void main(String args[]){
		String strA = "HelloWorld";
		
		if(strA.contains("hello")){//���ִ�Сд�ģ����û��
			System.out.printf("�ַ������д�����");
		}else{
			System.out.printf("û��\n");
		}
		
		System.out.printf("strA��e������Ϊ:%d\n",strA.indexOf("e"));//Ģ���ַ���������
		
		System.out.printf("strA��l������Ϊ:%d\n",strA.indexOf("l",3));
		
		System.out.printf("strA��e������Ϊ(�Ӻ���ǰ����):%d\n",strA.lastIndexOf("e"));
		
		System.out.printf("strA��l������Ϊ(�Ӻ���ǰ����):%d\n",strA.lastIndexOf("l",4));
		
		if(strA.startsWith("hel")){//����
			System.out.printf("�ַ�����������ͷ��");
		}else{
			System.out.printf("����\n");
		}
		
		if(strA.endsWith("rld")){//
			System.out.printf("�ַ�����������ͷ��");
		}else{
			System.out.printf("����\n");
		}
		
		
	}
}