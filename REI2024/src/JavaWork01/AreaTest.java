package JavaWork01;

public class AreaTest {
	public static void main(String[]args) {
	Area a1 = new Area(12,15,12);
	a1.area1();
	a1.volume();	
	System.out.println("=============================");
	//-----------------循环测试---------------------------
	Area a2[] = new Area[5];
	for(int i = 1;i <= a2.length ; i++ ) {
		a2[i-1] = new Area(1+i,2+1,3+i);
		System.out.println("第"+i+"个长方体的面积与体积为↓");
		a2[i-1].area1();
		a2[i-1].volume();
		System.out.println("=============================");
		}
	}
}
