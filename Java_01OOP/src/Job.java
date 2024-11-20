import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class User {
    private String name; // ユーザ名
    private List<String> clockRecords; // 出勤記録

    public User(String name) {
        this.name = name;
        this.clockRecords = new ArrayList<>(); // 出勤記録をインスタンス化
    }

    // ユーザ名を取得
    public String getName() {
        return name;
    }

    // 出勤
    public void clockIn(String type) {
        // 出勤時間を取得、初期化
        LocalDateTime now = LocalDateTime.now();
        String formattedTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // 出勤を取る
        String record = type + "出勤：" + formattedTime;
        clockRecords.add(record);
        System.out.println(name + " すでに " + record);
    }

    // 出勤記録を表示
    public void showRecords() {
        System.out.println(name + " の出勤記録：");
        for (String record : clockRecords) {
            System.out.println(record);
        }
    }
}
