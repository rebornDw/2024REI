package osrt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		
		String[] colors = {"白色","黑色","红色","灰色"};
		String[] brands = {"本田","丰田","奔驰","宝马"};
		
		System.out.println("请用数字选择车的颜色和品牌（最多添加十辆）");
		
		for (int i = 0;i < 10;i++) {
			System.out.println("第" + (i+1) + "辆车:");
			
			int colorChoice = -1;
			while (colorChoice < 1 || colorChoice > colors.length) {
				System.out.println("请用数字选择颜色");
				for (int j=0;j < colors.length;j++) {
					System.out.println((j+1) + "." + colors[j]);
				}
				colorChoice = scanner.nextInt();
				if (colorChoice < 1 || colorChoice > colors.length) {
					System.out.println("无效输入，请输入1到" + colors.length + "之间的数字");
				}
			}
			String color = colors[colorChoice-1];
			
			int brandChoice = -1;
			while(brandChoice < 1 || brandChoice > brands.length) {
				System.out.println("请用数字选择品牌");
				for (int j=0;j < brands.length;j++) {
					System.out.println((j+1) + "." + brands[j]);
				}
				brandChoice = scanner.nextInt();
				if (brandChoice < 1 || brandChoice > brands.length) {
					System.out.println("无效输入，请输入1到" + brands.length + "之间的数字");
				}
			}
			String brand = brands[brandChoice - 1];
			
			System.out.println("请输入价格，单位：万");
			double price = scanner.nextDouble();
			
			cars.add(new Car(color,price,brand));
			scanner.nextLine();//清空换行符
			
			System.out.println("按1继续添加车辆，按2退出:");
			int choice = scanner.nextInt();
			if (choice == 2) {
			    break; 
			}

		}
		paixu(cars);
		
		System.out.println("\n排序结果:");
		for (Car car : cars) {
            System.out.println(car);
        }
		
		scanner.close();
	}
    private static void paixu(List<Car> cars) {
        int n = cars.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars.get(j).getPrice() < cars.get(j + 1).getPrice()) {
                    Car temp = cars.get(j);
                    cars.set(j, cars.get(j + 1));
                    cars.set(j + 1, temp);
                }
            }
        }
    }

}
