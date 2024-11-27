public class StudentSort {

	public static void main(String[] args) {
		// Studentクラスの配列を作成し、インスタンス化
		Student[] students = new Student[5];
		// 各要素にStudentインスタンスを設定
		students[0] = new Student("张三", 85);
		students[1] = new Student("李四", 92);
		students[2] = new Student("王五", 78);
		students[3] = new Student("赵六", 56);
		students[4] = new Student("孙七", 63);

		// 各学生の情報を表示
		for (Student student : students) {
			student.display();
		}

		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - i - 1; j++) {
				if (students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;

				}

			}
		}
		// ソート後の学生の成績を表示
		System.out.println(" \nソート後の学生の成績:");
		for (Student student : students) {
			student.display();
		}

	}

}
