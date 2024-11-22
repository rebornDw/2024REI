public class Book {
    private String title;  // 书名
    private String author; // 作者
    private double price;  // 价格

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // 方法：判断书籍是否昂贵
    public String Expensive() {
        if (price > 100) {
        	return "昂贵";
        }else {
        	return "便宜";
        }
    }
}

