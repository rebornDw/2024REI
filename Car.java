package car;

public class Car extends Vehicle {
    private double price; 


    public Car(String brand, int year, double price) {
        super(brand, year);  
        this.price = price;  
    }

    public double getPrice() {
        return price;
    }

 
    public void setPrice(double price) {
        this.price = price;
    }

 
    public String toString() {
        return super.toString() + ", 价格: ¥" + String.format("%.2f", price);
    }
}
