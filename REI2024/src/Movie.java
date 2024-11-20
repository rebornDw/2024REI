public class Movie {
    private String name;   // 电影名称
    private String director; // 导演
    private double rating; // 评分

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    // 是否高分电影
    public boolean isHighRated() {
        return rating > 8.0;
    }

    // 电影信息
    public void displayInfo() {
        System.out.println("电影名称：" + name);
        System.out.println("导演：" + director);
        System.out.println("评分：" + rating);
    }
}
