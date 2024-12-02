package car;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<Car>();


        Car car1 = new Car("宝马", 2020, 500000.0);
        Car car2 = new Car("特斯拉", 2022, 350000.0);
        Car car3 = new Car("奔驰", 2018, 600000.0);
        Car car4 = new Car("奥迪", 2021, 450000.0);
        Car car5 = new Car("法拉利", 2023, 3000000.0);
        Car car6 = new Car("保时捷", 2022, 800000.0);
        Car car7 = new Car("雪佛兰", 2019, 250000.0);
        Car car8 = new Car("丰田", 2020, 350000.0);
        Car car9 = new Car("本田", 2017, 180000.0);
        Car car10 = new Car("日产", 2021, 320000.0);

 
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

 
        System.out.println("排序前的车辆信息：");
        printCarList(carList);

  
        TestPrice(carList);


        System.out.println("按价格排序后的车辆信息：");
        printCarList(carList);

     
        TestYear(carList);


        System.out.println("按年份排序后的车辆信息：");
        printCarList(carList);
    }


    public static void printCarList(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    
    public static void TestPrice(ArrayList<Car> carList) {
        int n = carList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (carList.get(j).getPrice() < carList.get(j + 1).getPrice()) {
               
                    Car temp = carList.get(j);
                    carList.set(j, carList.get(j + 1));
                    carList.set(j + 1, temp);
                }
            }
        }
    }


    public static void TestYear(ArrayList<Car> carList) {
        int n = carList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (carList.get(j).getYear() < carList.get(j + 1).getYear()) {
             
                    Car temp = carList.get(j);
                    carList.set(j, carList.get(j + 1));
                    carList.set(j + 1, temp);
                }
            }
        }
    }
}
