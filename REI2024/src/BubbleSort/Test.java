package BubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test{
	public static void main(String[]args) {
		
		List<Student> students = new ArrayList<>();
		//ランダムに学生の成績を表示
		Random random = new Random();
		students.add(new Student("佐藤",random.nextInt(101)));
		students.add(new Student("小野",random.nextInt(101)));
		students.add(new Student("田中",random.nextInt(101)));
		students.add(new Student("山田",random.nextInt(101)));
		students.add(new Student("小倉",random.nextInt(101)));
		students.add(new Student("高梨",random.nextInt(101)));
		students.add(new Student("大城",random.nextInt(101)));
		students.add(new Student("井上",random.nextInt(101)));
		students.add(new Student("黒崎",random.nextInt(101)));
		students.add(new Student("佐久間",random.nextInt(101)));
		
		System.out.println("ソート前:");
		for(Student student : students) {
			System.out.println(student);
		}
		
		Bubblesort.bubblesort(students);
		System.out.println("～～～～～～～～～～～～～～～～");
		
		System.out.println("ソート後:");
		for(Student student : students) {
			System.out.println(student);
		}
	}
}