
public class ComputerTest {
	public static void main(String[] args) {
		// 创建对象数组3个
		Computer[] arr = new Computer[3];
		// 创建三个对象
		Computer c1 = new Computer("外星人", 6999.5, "15.6寸");
		Computer c2 = new Computer("戴尔", 5999.5, "15寸");
		Computer c3 = new Computer("联想", 4999.5, "14寸");
		// 对象放入数组
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		// 遍历数组
		System.out.println("电脑具体信息：");
		for (int i = 0; i < arr.length; i++) {
			Computer c = arr[i];
			String s = "[";
			s = s + (c.getBrand() + "," + c.getPrice() + "," + c.getSize() + "]");
			System.out.println(s);
		}
		//计算花费并输出
		double cost = c1.cost(c1.getPrice(), 5);
		System.out.println("共需" + cost + "元");
	}
}
