public class Car {
    private String brand;   // 品牌
    private String model;   // 型号
    private int yearsUsed;  // 使用年限

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYearsUsed(int yearsUsed) {
        this.yearsUsed = yearsUsed;
    }

    public int getYearsUsed() {
        return yearsUsed;
    }

    // 是否为老旧车辆
    public boolean isOldCar() {
        return yearsUsed > 10;
    }
}
