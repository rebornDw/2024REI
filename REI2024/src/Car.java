
public class Car {
	//车的属性
	private String yanse; // 颜色
	private String pinpai;// 品牌
	private int jiage;// 价格
	
	
	public String getYanse() {
		return yanse;
	}
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public int getJiage() {
		return jiage;
	}
	public void setJiage(int jiage) {
		this.jiage = jiage;
	}
	
	//方法：根据价格分类
	public String dengji() {
		if (jiage < 100000) {
			return "A";
		}else if (jiage < 200000) {
			return "B";
		}else if (jiage < 300000) {
			return"C";
		}else if (jiage < 400000) {
			return"D";
		}
		return"E";
	}
	
}


