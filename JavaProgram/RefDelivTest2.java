class Parents{
	private String name;
	private Income inc;
	private Parents Child;//����
	
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
		return "����" + ":" + this.date + "\n" + "���" + ":" + this.money + "\n" ;
	}
}

public class RefDelivTest2{
	public static void main(String args[]){
		Parents father = new Parents("����");
		Parents mother = new Parents("ĸ��");
		Parents child = new Parents("����");
		
		Income inc_fa = new Income(5000,"2016.1.7");
		Income inc_mo = new Income(4000,"2016.2.1");
		Income inc_ch = new Income(100,"2016.3.18");
		
		//���ö�Ӧ��ϵ
		father.setInc(inc_fa);//���׵�����
		mother.setInc(inc_mo);//ĸ�׵�����
		
		child.setInc(inc_ch);
		inc_ch.setPar(child);
		father.setChild(child);
		
		//���׵�����
		System.out.print( father.getInfo() );
		System.out.print( father.getInc().getInfo() );
		//ĸ�׵�����
		System.out.print( mother.getInfo() );
		System.out.print( mother.getInc().getInfo() );
		//���ӵ�����
		System.out.print( father.getChild().getInfo() );
		System.out.print( father.getChild().getInc().getInfo() );
	}
}























