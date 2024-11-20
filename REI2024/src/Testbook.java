public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("学习强国");
        book.setAuthor("aaa bbb");
        book.setPrice(100);
        
        book.displayInfo();  // 显示书籍信息
    }
}
