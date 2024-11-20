package JavaWork01;

public class Computer {
	public String CPU;
	public String brand;		//主板品牌
	public int Memory;			//内存
	public String motherboard;	//主板型号
	public String graphics;		//显卡
	public int M2;				//硬盘容量

//打印↓
	public void daYin() {
		System.out.println("主板："+this.brand+"\n"+"CPU:："+this.CPU+"\n"+"内存容量："+this.Memory+"Gb"+"\n"
		+"主板型号:"+this.motherboard+"\n"+"显卡:"+this.graphics+"\n"+"硬盘容量:"+this.M2+"Gb");
	}
}