public class StrSplit{
	public static void main(String args[]){
		String str = "����:20|����:21|������:22";
		
		String temp[] = str.split("\\|");
		for(int i = 0 ; i<temp.length ; i++){
			System.out.printf("����temp�����%d������:%s\n",i,temp[i]);
		}
		
		System.out.println("����temp�ĳ���Ϊ:" + temp.length);
		
		for(int j = 0; j<temp.length ; j++){//��ѭ��Ϊ�������
			String result[] = temp[j].split(":");//һ��tempԪ�ز�ֳ�����Ԫ��  ����result������ ��0 1
			System.out.printf("����Ϊ:%s,����Ϊ:%s\n",result[0],result[1]);
		}
	}
}