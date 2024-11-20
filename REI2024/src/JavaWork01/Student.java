package JavaWork01;
public class Student {
	public String name;
	public int banJi;
	public int chengJi;
	public String eat;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBanJi() {
		return banJi;
	}


	public void setBanJi(int banJi) {
		this.banJi = banJi;
	}


	public int getChengJi() {
		return chengJi;
	}


	public void setChengJi(int chengJi) {
		this.chengJi = chengJi;
	}


	public String getEat() {
		return eat;
	}


	public void setEat(String eat) {
		this.eat = eat;
	}

//------------------方法里测试if--------------------
	public void kaoShi(){
		if(this.chengJi >= 60) {
			System.out.println("考试成绩合格");
		}else {
			System.out.println("考试成绩不合格");
		}
	}
}
