class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("图书名称:" + title + ",价格:" + price);
	}
}

public class TestDemo{
	public static void main(String args[]){
		Book bk = new Book();
		bk.title = "java开发";
		bk.price = 89.9;
		bk.getInfo();
	}
}