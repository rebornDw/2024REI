package homework.assignment;
import java.util.Random;

class Student {
    String name; // 学生姓名
    int score;   // 学生成绩

    // 构造方法
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class BubbleSortExample {
    public static void main(String[] args) {
        // 创建一个包含 10 个学生的数组
        Student[] students = new Student[10];

        // 使用随机数生成学生成绩
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student" + (i + 1), random.nextInt(101)); // 成绩范围 0-100
        }

        // 打印排序前的学生成绩
        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.score);
        }

        // 冒泡排序：按照成绩从高到低排序
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score < students[j + 1].score) { // 成绩较小的放后面
                    // 交换位置
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // 打印排序后的学生成绩
        System.out.println("\nAfter Sorting (From High to Low):");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.score);
        }
    }
}
