class Student{
	private String Name;
	private String Sex;
	private String PhNum;
	
	public void setName(String N){
		Name = N ;
	}
	public void setSex(String S){
		Sex = S ;
	}
	public void setPhNum(String PN){
		PhNum = PN ;
	}
	public String getName(){
		return Name;
	}
	public String getSex(){
		return Sex;
	}
	public String getPhNum(){
		return PhNum;
	}
	public Student(){
		System.out.println("��ֻ��һ���չ��췽��!!!\n");
	}
	public Student(String N,String S,String PN){
		Name = N; Sex = S; PhNum = PN;
	}
	public String ShowInfo(){
		return  "ѧ������:" + Name + "\n" +
				"ѧ���Ա�:" + Sex  + "\n" +
				"ѧ���绰:" + PhNum +"\n" ;
	}
}

public class classDemo{
	public static void main(String args[]){
		Student stu = new Student();
		
		Student Stu = new Student("���","��","1234568798");
		System.out.println(Stu.ShowInfo());
		  
		Stu.setName("С��");//��ѧ�����ָ�ΪС��
		
		System.out.print(Stu.ShowInfo());
	}
}