import java.util.Scanner;

public class UsersTest {
	public static void main(String[] args) {
		// 创建对象
		Users user = new Users("汪汪", "wangwang520", "Ousyouen@outlook.com");
		// 获取对象信息
		user.usersImform();
		// 键盘输入用户信息，确认对错
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.next();
		System.out.println("请输入用户密码：");
		String password = sc.next();
		user.usersComfirm(name, password);
	}
}
