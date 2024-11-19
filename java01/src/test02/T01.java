package test02;

import java.util.Scanner;

public class T01 {

	public static void Menu() {
		System.out.println("欢迎");
		System.out.println("1图书列表");
		System.out.println("2添加图书");
		System.out.println("0代表退出");
		System.out.println("请输入");
	}

	public static void main(String[] args) {

		BookManager manager = new BookManager();
		manager.initBooks();// 调用图书
		Menu();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		while (num != 0) {
			if (num == 1) {
				manager.bookList();
				Menu();
				num = input.nextInt();
			} else if (num == 2) {
				System.out.println("这里是图书界面");
				Book book = new Book();
				System.out.println("请输入图书名称");
				book.bookName = input.next();
				System.out.println("请输入图书作者");
				book.bookAuthor = input.next();
				System.out.println("请输入图书价格");
				book.price = input.nextInt();
//返回true添加成功 返回false添加失败
				Boolean flag = manager.bookAdd(book);
				if (flag = true) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}
				Menu();
				num = input.nextInt();
			} else if (num == 0) {
				break;
			}

		}
		System.out.println("感谢您使用该系统");
	}
}
