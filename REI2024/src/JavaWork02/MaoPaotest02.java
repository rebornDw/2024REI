package JavaWork02;

import java.util.Scanner;

public class MaoPaotest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要添加的学生人数：");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); 									// 消耗换行符
        MaoPao[] students = new MaoPao[studentCount];      	  // 数组初始化
        // 输入学生信息
        for (int i = 0; i < studentCount; i++) {
            System.out.print("请输入第 " + (i + 1) + " 位学生的名字：");
            String name = scanner.nextLine();
            System.out.print("请输入第 " + (i + 1) + " 位学生的成绩：");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            students[i] = new MaoPao(name, score);
        }
            students[0].paiXu(students);

        System.out.println("----------------班级学校排名----------------：");
        if (students.length > 0) {
            students[0].print(students);
        }

        scanner.close();
    }
}
