class Student{
	private String Name;
	private int Num;
	private String Sex;
	public Student(String Name,int Num,String Sex){
		this.Name = Name;
		this.Num = Num;
		this.Sex = Sex;
	}
	//set get方法略。
	public String print(){
		return "姓名:" + this.Name + "\n" +
			   "学号:" + this.Num  + "\n" +
			   "性别:" + this.Sex ;
	}
}
public class ThisDemo{
	public static void main(String args[]){
		Student stu = new Student("大白",15153631,"男");
		System.out.print( stu.print() );
	}
}