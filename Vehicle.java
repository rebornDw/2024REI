package car;

public class Vehicle {
    private String brand; 
    private int year;     

    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

   
    public String getBrand() {
        return brand;
    }

   
    public int getYear() {
        return year;
    }


    public String toString() {
        return "品牌: " + brand + ", 年份: " + year;
    }
}
