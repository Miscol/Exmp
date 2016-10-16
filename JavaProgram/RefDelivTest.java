class Student{
	private String name;
	private ID id;
	
	public Student(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return "ѧ������:" + this.name + "\n";
	}
	
	public void setId(ID id){
		this.id = id;
	}
	public ID getId(){
		return this.id;
	}
}

class ID{
	private String num;
	private String sex;
	private Student stu;
	
	public ID(String num,String sex){
		this.num = num;
		this.sex = sex;
	}
	
	public String getInfo(){
		return "ѧ��ѧ��:" + this.num + "\n" + "ѧ���Ա�:" + this.sex + "\n" ;
	}
	
	public void setStu(Student stu){
		this.stu = stu ;
	}
	public Student getStu(){
		return this.stu;
	}
	
}

public class RefDelivTest{
	public static void main(String args[]){
		Student stu = new Student("���");
		ID id = new ID("15153631","��");
	
		//���ö�Ӧ��ϵ��������
		stu.setId(id);//һ��ѧ���ж�Ӧ��ѧ�ż��Ա�
		id.setStu(stu);//ѧ�ź��Ա����ҵ������
		
		//ͨ�������ҵ���ѧ����ѧ���Լ��Ա�
		System.out.print( stu.getId().getInfo() );
		//ͨ��ѧ���Լ��Ա��ҵ�����ѧ��
		System.out.print( id.getStu().getInfo() ); 
	}
}















