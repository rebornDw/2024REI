import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// 创建数组对象
		Goods[] arr = new Goods[3];
		// 键盘输入3个商品信息
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			Goods goods = new Goods();
			System.out.println("请输入商品名：");
			goods.setName(sc.next());
			System.out.println("请输入商品价格：");
			goods.setPrice(sc.nextDouble());
			System.out.println("请输入商品颜色：");
			goods.setColor(sc.next());
			arr[i] = goods;
		}
		//遍历所有商品
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " " + arr[i].getPrice() + " " + arr[i].getColor());
		}
		
	}

}
