class Student{
	private String Name;
	private int Num;
	private String Sex;
	public Student(String Name,int Num,String Sex){
		this.Name = Name;
		this.Num = Num;
		this.Sex = Sex;
	}
	//set get�����ԡ�
	public String print(){
		return "����:" + this.Name + "\n" +
			   "ѧ��:" + this.Num  + "\n" +
			   "�Ա�:" + this.Sex ;
	}
}
public class ThisDemo{
	public static void main(String args[]){
		Student stu = new Student("���",15153631,"��");
		System.out.print( stu.print() );
	}
}