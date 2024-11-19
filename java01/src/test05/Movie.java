package test05;

public class Movie {

	public String movieName;// 电影名称
	public String director;// 电影导演
	String[] actors = new String[5];// 演员

	/*
	 * public void initData() { actors[0] = "张三"; actors[1] = "李四"; actors[2] =
	 * "王五"; actors[3] = "陈六"; actors[4] = "王七"; }
	 */

	public void show() {
		System.out.println("电影的名称为" + movieName);
		System.out.println("电影的导演为" + director);
		System.out.println("电影的演员");

		for (int i = 0; i < actors.length; i++) {
			System.out.println(actors[i]);
		}

	}
}
