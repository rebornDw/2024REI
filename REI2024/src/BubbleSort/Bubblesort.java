package BubbleSort;

import java.util.List;

public class Bubblesort {

    public static void bubblesort(List<Student> students) {
        int n = students.size();
        //外部ループ
        for (int i = 0; i < n - 1; i++) {
        	//内部ループ
            for (int j = 0; j < n - 1 - i; j++) {
                // 各学生の成績を取得、比べる
                if (students.get(j).getScore() < students.get(j + 1).getScore()) {
                    // 大きい方は前に入れ替わる
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}
