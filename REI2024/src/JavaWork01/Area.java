package JavaWork01;

public class Area {
	public int long_1;
	public int width;
	public int height;
	public Area(int long_1, int width, int height) {
		this.long_1 = long_1;
		this.width = width;
		this.height = height;
	}
	//--------------计算面积------------------------
	public void area1() {
		int area = this.long_1 * this.width;
		System.out.println("这个长方体的面积为："+area+"\n");
	}
	//--------------计算体积------------------------
	public void  volume() {
		int volume = this.long_1 * this.width * height;
		System.out.println("这个长方体的体积为："+volume+"\n");
	}
	
}
