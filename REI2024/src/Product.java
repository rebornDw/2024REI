public class Product {
    private String name;  // 商品名称
    private int stock;    // 库存量
    private double price; // 价格

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // 方法：判断库存状态
    public String stockStatus() {
        if (stock > 0) {
        	return "在库";
        }else {
        	return "缺货";
        }
    }
}

