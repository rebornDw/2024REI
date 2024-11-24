package test02;

public class BookManager {

	Book[] books = new Book[50];

//初始化图书
//	public void initBooks() {
//		
//
//	}
	public void Book() {
		Book book = new Book();

		book.bookName = "阿泰勒的角落";
		book.bookAuthor = "李娟";
		book.price = 59;
		books[0] = book;

		Book book2 = new Book();

		book2.bookAuthor = "飞鸽";
		book2.bookName = "斯坦";
		book2.price = 24;

		books[1] = book2;
	}

//图书列表
	public void bookList() {
		System.out.println("这里是图书列表");
		System.out.println("书名\t\t作者\t\t价格  ");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].bookName + "\t\t" + books[i].bookAuthor + "\t\t" + books[i].price);
			}

		}
	}

//增加图书
	public boolean bookAdd(Book book) {
		boolean flag = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;

				flag = true; // 添加成功
				break;
			}
		}
		return flag;

	}
}
