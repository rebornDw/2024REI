package test2;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		
		app java = new app();
		
		java.setKaifaZhe("大伟哥团队开发");
		java.setMingCheng("原神");
		System.out.println(java.getKaifaZhe());
		System.out.println(java.getMingCheng());
		
		
		
		//应用大小
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入应用大小(MB):");
		
		int yingyongdaxiao =sc.nextInt();
			
		if ( yingyongdaxiao> 1024) {
				System.out.println("无法安装");
			}else {
				System.out.println("可以安装");
		}
		
		
		
		
	}

}
