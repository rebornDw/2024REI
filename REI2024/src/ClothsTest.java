
public class ClothsTest {

	public static void main(String[] args) {
		// 创建衣服数组3个
		Cloths[] arr = new Cloths[3];
		// 创建衣服对象，并放入数组
		Cloths cs1 = new Cloths("短裙", 899, 0.7, 25);
		Cloths cs2 = new Cloths("牛仔裤", 659, 0.8, 30);
		Cloths cs3 = new Cloths("短袖", 500, 0.9, 40);
		arr[0] = cs1;
		arr[1] = cs2;
		arr[2] = cs3;
		// 遍历所有衣服信息
		for (int i = 0; i < arr.length; i++) {
			Cloths cs = arr[i];
			System.out.println(cs.getName() + "|" + cs.getPrice() + "|" + cs.getDiscount() + "|" + cs.getAmount());
		}
		//获取购买后剩余库存
		int result= arr[0].count(arr[0].getName(), 4, arr);
		System.out.println("剩余库存:" + result);
	}

}
