class AddNum{
	int a,b;
	public void Show(){
		System.out.print("The Sum is :" + (a+b) );
	}
}

public class 类与对象测试{
	public static void main(String args[]){
		AddNum add = new AddNum();
		
		add.a = 20; add.b = 40;
		
		add.Show();
	}
}