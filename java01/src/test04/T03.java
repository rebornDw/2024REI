package test04;

import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {

		UserInfo[] users = new UserInfo[50];
		UserInfo info = new UserInfo();

		info.userName = "微笑的雨";
		info.userPassWord = "111222";

		users[0] = info;

		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名");
		String uname = input.next();
		System.out.println("请输入密码");
		String upwd = input.next();

		boolean flag = false;

		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && users[i].userName.equals(uname) && users[i].userPassWord.equals(upwd)) {
				flag = true;
				break;
			}

		}
		if (flag == true) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
	}

}
