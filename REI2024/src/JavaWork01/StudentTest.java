package JavaWork01;

public class StudentTest {
		public static void main(String[]args) {
			Student liujianting = new Student(); 
			liujianting.name = "刘鉴霆";
			liujianting.banJi = 1;
			liujianting.chengJi = 85;
			liujianting.eat = "锅包肉";
			System.out.println("名字："+ liujianting.name +"\n"+ "班级："+liujianting.banJi +"班"+"\n"+"成绩："+liujianting.chengJi+"\n"+"喜欢吃："+liujianting.eat );
			liujianting.kaoShi();
		}
	}