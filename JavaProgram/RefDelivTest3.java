//学生都在同一学校，学生间有上下级关系，一个学校有很多学生.
class School{
	private String Scname;
	private String loc;
	private int PostCode;
	
	public School(String Scname,String loc,int PostCode){
		this.Scname = Scname;
		this.loc = loc;
		this.PostCode = PostCode;
	}
	
	//多个学生
	private Student[] students;
	public void setStudents(Student[] students){
		this.students = students;
	}
	public Student[] getStudents(){  //这里的返回值是一个Student对象数组
		return this.students;
	}
	
	public String getInfo(){
		return "学校名称:" + this.Scname + ",学校位置:" + this.loc + ",学校邮编" + this.PostCode + "\n" ;
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
		return "学生姓名:" + this.name + ",学生性别:" + this.sex + ",学生编号:" + this.num + ",学生职位:" + this.job + "\n" ;
	}
}

public class RefDelivTest3{
	public static void main(String args[]){
		//第一步：设置数据
		School sch = new School("綦江中学","綦江",401442);//学校信息
		Student StuA = new Student("大白","男","10111","组员");//学生信息
		Student StuB = new Student("小白","女","10112","组长");
		Student StuC = new Student("阿宇","男","11002","班长");
		//第二步：设置学生间的关系
		StuA.setMgr(StuB);
		StuB.setMgr(StuC);
		//第三步：设置学生和学校关系
		StuA.setSchool(sch);
		StuB.setSchool(sch);
		StuC.setSchool(sch);
		//第四步：设置学校与学生关系
		sch.setStudents(new Student[]{StuA,StuB,StuC});
		
		//第四步：输出对应关系
		//1.通过学校找到所有学生的信息,以及通过学生找到之间的关系
		System.out.print( sch.getInfo() );//学校信息
		for(int i = 0;i<sch.getStudents().length;i++){
			System.out.print( sch.getStudents()[i].getInfo() ); 
			//学生间的关系
			if(sch.getStudents()[i].getMgr() != null){
			System.out.print( "\t-" + sch.getStudents()[i].getMgr().getInfo() );
			}
		}
		
		
	}
}
	


















