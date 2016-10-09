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
		System.out.println("这只是一个空构造方法!!!\n");
	}
	public Student(String N,String S,String PN){
		Name = N; Sex = S; PhNum = PN;
	}
	public String ShowInfo(){
		return  "学生姓名:" + Name + "\n" +
				"学生性别:" + Sex  + "\n" +
				"学生电话:" + PhNum +"\n" ;
	}
}

public class classDemo{
	public static void main(String args[]){
		Student stu = new Student();
		
		Student Stu = new Student("大白","男","1234568798");
		System.out.println(Stu.ShowInfo());
		  
		Stu.setName("小白");//将学生名字改为小白
		
		System.out.print(Stu.ShowInfo());
	}
}