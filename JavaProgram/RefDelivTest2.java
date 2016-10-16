class Parents{
	private String name;
	private Income inc;
	private Parents Child;//孩子
	
	public Parents(String name){
		this.name = name;
	}
	public void setInc(Income inc){
		this.inc = inc;
	}
	public Income getInc(){
		return this.inc;
	}
	public String getInfo(){
		return this.name + ":" + "\n";
	}
	public void setChild(Parents Child){
		this.Child = Child;
	}
	public Parents getChild(){
		return this.Child;
	}
}

class Income{
	private int money;
	private String date;
	private Parents par;
	
	public Income(int money, String date){
		this.money = money;
		this.date = date;
	}
	public void setPar(Parents par){
		this.par = par;
	}	
	public Parents getPar(){
		return this.par = par;
	}
	
	public String getInfo(){
		return "日期" + ":" + this.date + "\n" + "金额" + ":" + this.money + "\n" ;
	}
}

public class RefDelivTest2{
	public static void main(String args[]){
		Parents father = new Parents("父亲");
		Parents mother = new Parents("母亲");
		Parents child = new Parents("孩子");
		
		Income inc_fa = new Income(5000,"2016.1.7");
		Income inc_mo = new Income(4000,"2016.2.1");
		Income inc_ch = new Income(100,"2016.3.18");
		
		//设置对应关系
		father.setInc(inc_fa);//父亲的收入
		mother.setInc(inc_mo);//母亲的收入
		
		child.setInc(inc_ch);
		inc_ch.setPar(child);
		father.setChild(child);
		
		//父亲的收入
		System.out.print( father.getInfo() );
		System.out.print( father.getInc().getInfo() );
		//母亲的收入
		System.out.print( mother.getInfo() );
		System.out.print( mother.getInc().getInfo() );
		//孩子的收入
		System.out.print( father.getChild().getInfo() );
		System.out.print( father.getChild().getInc().getInfo() );
	}
}























