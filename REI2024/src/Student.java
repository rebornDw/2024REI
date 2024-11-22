public class Student {
    private String name;  // 姓名
    private int age;      // 年龄
    private float score; // 成绩

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    // 方法：判断成绩等级
    public String grade() {
        if (score >= 90) {
            return "优秀";
        } else if (score >= 75) {
            return "良好";
        } else if (score >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}

