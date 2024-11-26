package sort;

import java.util.ArrayList;

public class Book {
	// 親クラスBookを定義し、プロパティとして書名、著者名、価格、数量を宣言する。
	private String bookName;
	private String authorName;
	private double price;
	private int amount;

	public Book() {
	}

	public Book(String bookName, String authorName, double price, int amount) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.amount = amount;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

//冒泡排序，按照价格从高到低排列书籍
	public static ArrayList<Book> sortPrice(ArrayList<Book> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getPrice() < list.get(j + 1).getPrice()) {
					Book temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}

	// 冒泡排序，按照数量从低到高排列书籍
	public static ArrayList<Book> sortAmount(ArrayList<Book> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getAmount() > list.get(j + 1).getAmount()) {
					Book temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}

	// 遍历集合
	public static void bookInform(ArrayList<Book> list) {
		System.out.println("库存图书如下：");
		System.out.println("==========================");
		for (Book k : list) {
			System.out.println(
					"[" + k.getBookName() + "," + k.getAuthorName() + "," + k.getPrice() + "," + k.getAmount() + "]");
		}
	}

	// 冒泡排序，按照固定格式价格从高到低排列书籍
	public static void priceSort(ArrayList<Book> list) {
		System.out.println("========按照价格从高到低排序书籍==========");
		ArrayList<Book> newList = Book.sortPrice(list);
		for (Book k : newList) {
			System.out.println("[价格：" + k.getPrice() + "," + k.getBookName() + "," + k.getAuthorName() + ","
					+ k.getAmount() + "]");
		}
	}

	// 冒泡排序，按照固定格式数量从低到高排列书籍
	public static void amountSort(ArrayList<Book> list) {
		System.out.println("========按照数量从多到少排序书籍==========");
		ArrayList<Book> newList = Book.sortAmount(list);
		for (Book k : newList) {
			System.out.println(
					"[数量：" + k.getAmount() + "," + k.getBookName() + "," + k.getPrice() + "," + k.getAmount() + "]");
		}
	}

}
