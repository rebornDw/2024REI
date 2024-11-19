
public class Computer {
	//声明变量。电脑品牌，价格，及大小
	private String brand;
    private double price;
    private String size;
	public Computer() {
	}
	public Computer(String brand, double price, String size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double cost(double price, int count) {
		double result = price * count;
		return result;
	}
}
