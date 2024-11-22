
public class Animal {
	private String name;//名称
	private String where;//栖息地
	private double weight;//体重
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//方法：判断是否是大型动物
	public String tixing() {
		if (weight < 30) {
			return "小型";
		}else{
			return "大型";
		}
	}

}
