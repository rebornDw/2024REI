import java.util.Scanner;

public class BoyFriendTest {

	public static void main(String[] args) {
		//创建三个男友
		BoyFriend bf1 = new BoyFriend("小明",18,183.5,"做饭");
		BoyFriend bf2 = new BoyFriend("小王",25,185.7,"睡觉");
		//比较男友身高
		bf1.compare(bf1.getName(), bf1.getHeight(), bf2.getName(), bf2.getHeight());
		//创建数组，把对象放入数组
		BoyFriend[] arr = new BoyFriend[2];
		arr[0] = bf1;
		arr[1] = bf2;
		//键盘输入男友姓名，遍历对应男友全部信息
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您男友的姓名：");
		String name = sc.next();
		boyInform(name, arr);
	}
	public static void boyInform(String name,BoyFriend[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getName().equals(name)) {
				BoyFriend bf = arr[i];
				System.out.println(bf.getName() + "," + bf.getAge() + "," + bf.getHeight() + "," + bf.getTalent());
			}
		}
	}
}
