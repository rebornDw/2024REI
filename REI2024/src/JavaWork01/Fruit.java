package JavaWork01;

public class Fruit {
	public String name;
	public float price;		
	public float weight;	
	
	public Fruit(String name,float price,float weight) {{
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
}
	 public void checkInfo() {
	        if (price * weight >= 10000) {
	            System.out.println("高額な果物です！絶対二回買わない"+"\n");
	        }else {
	        	System.out.println("安い果物です！明日もう一度買います"+"\n");
	        }
	    }
	//------------------方法里套方法测试--------------------
	public void print(){
		System.out.println(
				"今日は" + name +"を買いました"+"\n"+
				"毎キロが"+price+"円です"+"\n"+
				"全部"+price*weight +"円かかりました"
		);
		checkInfo();
	}
}
