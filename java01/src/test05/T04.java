package test05;

public class T04 {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.movieName = "我的2024";
		movie.director = "微冷的雨";
		movie.actors[0] = "张三";
		movie.actors[1] = "李四";
		movie.actors[2] = "王五";
		movie.actors[3] = "陈六";
		movie.actors[4] = "王七";

		// movie.initData();
		movie.show();
	}

}
