//ѧ������ͬһѧУ��ѧ���������¼���ϵ��һ��ѧУ�кܶ�ѧ��.
class School{
	private String Scname;
	private String loc;
	private int PostCode;
	
	public School(String Scname,String loc,int PostCode){
		this.Scname = Scname;
		this.loc = loc;
		this.PostCode = PostCode;
	}
	
	//���ѧ��
	private Student[] students;
	public void setStudents(Student[] students){
		this.students = students;
	}
	public Student[] getStudents(){  //����ķ���ֵ��һ��Student��������
		return this.students;
	}
	
	public String getInfo(){
		return "ѧУ����:" + this.Scname + ",ѧУλ��:" + this.loc + ",ѧУ�ʱ�" + this.PostCode + "\n" ;
	}
}

class Student{
	private String name;
	private String sex;
	private String num;
	private String job;
	
	public Student(String name,String sex,String num,String job){
		this.name = name;
		this.sex = sex;
		this.num = num;
		this.job = job;
	}
	
	private School school;
	public void setSchool(School school){
		this.school = school;
	}
	public School getSchool(){
		return this.school;
	}
	
	private Student Mgr;
	public void setMgr(Student Mgr){
		this.Mgr = Mgr;
	}
	public Student getMgr(){
		return this.Mgr;
	}
	
	public String getInfo(){
		return "ѧ������:" + this.name + ",ѧ���Ա�:" + this.sex + ",ѧ�����:" + this.num + ",ѧ��ְλ:" + this.job + "\n" ;
	}
}

public class RefDelivTest3{
	public static void main(String args[]){
		//��һ������������
		School sch = new School("�뽭��ѧ","�뽭",401442);//ѧУ��Ϣ
		Student StuA = new Student("���","��","10111","��Ա");//ѧ����Ϣ
		Student StuB = new Student("С��","Ů","10112","�鳤");
		Student StuC = new Student("����","��","11002","�೤");
		//�ڶ���������ѧ����Ĺ�ϵ
		StuA.setMgr(StuB);
		StuB.setMgr(StuC);
		//������������ѧ����ѧУ��ϵ
		StuA.setSchool(sch);
		StuB.setSchool(sch);
		StuC.setSchool(sch);
		//���Ĳ�������ѧУ��ѧ����ϵ
		sch.setStudents(new Student[]{StuA,StuB,StuC});
		
		//���Ĳ��������Ӧ��ϵ
		//1.ͨ��ѧУ�ҵ�����ѧ������Ϣ,�Լ�ͨ��ѧ���ҵ�֮��Ĺ�ϵ
		System.out.print( sch.getInfo() );//ѧУ��Ϣ
		for(int i = 0;i<sch.getStudents().length;i++){
			System.out.print( sch.getStudents()[i].getInfo() ); 
			//ѧ����Ĺ�ϵ
			if(sch.getStudents()[i].getMgr() != null){
			System.out.print( "\t-" + sch.getStudents()[i].getMgr().getInfo() );
			}
		}
		
		
	}
}
	


















