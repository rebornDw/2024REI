public class TestMovie {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("我不是药神");
        movie.setDirector("徐峥");
        movie.setRating(8.8);

        // 信息
        movie.displayInfo();

        // 是否高分电影
        if (movie.isHighRated()) {
            System.out.println("这是一部高评分电影！");
        } else {
            System.out.println("这不是一部高评分电影！");
        }
    }
}
