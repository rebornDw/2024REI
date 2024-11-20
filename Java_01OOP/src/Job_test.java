public class Job_test {
    public static void main(String[] args) {
        // ユーザを作る
        User user1 = new User("田中");
        User user2 = new User("佐藤");

        // 出勤を取る
        user1.clockIn("出勤");
        user2.clockIn("出勤");

        // 出勤記録を表示
        user1.showRecords();
        user2.showRecords();
    }
}
