
public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Java入门");
		book1.setAuthor("Bruce Eckel");
		book1.setPrice(150);
		
		Book book2 = new Book();
		book2.setTitle("活着");
		book2.setAuthor("余华");
		book2.setPrice(80);
		
		System.out.println(book1.getTitle() + "这本书的价格区间是" + book1.Expensive());
		System.out.println(book2.getTitle() + "这本书的价格区间是" + book2.Expensive());

	}
	

}
