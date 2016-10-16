class Student{
	private String name;
	private ID id;
	
	public Student(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return "学生姓名:" + this.name + "\n";
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
		return "学生学号:" + this.num + "\n" + "学生性别:" + this.sex + "\n" ;
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
		Student stu = new Student("大白");
		ID id = new ID("15153631","男");
	
		//设置对应关系！！！！
		stu.setId(id);//一个学生有对应的学号及性别
		id.setStu(stu);//学号和性别能找到这个人
		
		//通过姓名找到该学生的学号以及性别
		System.out.print( stu.getId().getInfo() );
		//通过学号以及性别找到该名学生
		System.out.print( id.getStu().getInfo() ); 
	}
}















