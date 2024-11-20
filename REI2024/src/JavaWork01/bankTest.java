package JavaWork01;

public class bankTest {
	public static void main(String[]args) {
	bank b1 = new bank(88888888,888888,200000);
	//-------------存取款测试-----------------
	b1.qukuan(-500);
	b1.qukuan(300000);
	b1.qukuan(50000);
	b1.cunkuan(20000);
	}
}
