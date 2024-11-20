public class Book {
    private String title;  // 书名
    private String author; // 作者
    private double price;  // 价格

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("书名：" + title + "，作者：" + author + "，价格：" + price + "元");
    }
}
