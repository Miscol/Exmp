class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("ͼ������:" + title + ",�۸�:" + price);
	}
}

public class TestDemo{
	public static void main(String args[]){
		Book bk = new Book();
		bk.title = "java����";
		bk.price = 89.9;
		bk.getInfo();
	}
}