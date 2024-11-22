public class Phone {
    private String brand; // 品牌
    private int price;    // 价格
    private int memory;   // 内存大小

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    // 方法：根据价格分类
    public String priceCategory() {
        if (price < 2000) {
            return "经济型";
        } else if (price < 5000) {
            return "中端型";
        } else {
            return "高端型";
        }
    }
}
