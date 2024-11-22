package test4;

import java.util.Random;

public class test4 {
	
	 private static double zuidipinlv = 1.0; // 最低频率 1.0 
     private static double  zuigaopinlv = 5.0; // 最高频率 5.0
	
     // 模拟 CPU 频率变化
	public static void main(String[] args) {
		
	 Random random = new Random();
	 
	 for (int i = 0; i < 10; i=i+1) {
         
         double dangqianpinlv = zuidipinlv + (zuigaopinlv - zuidipinlv) * random.nextDouble();
		
         System.out.printf("第 %d 秒，模拟的 CPU 频率：%.2f GHz\n", i + 1, dangqianpinlv);
		
		
		
	 }
	}
}

