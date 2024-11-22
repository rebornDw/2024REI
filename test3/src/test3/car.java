package test3;

public class car {
	
	    private int speed;  // 车速，单位：km/h

	    public car() {
	        this.speed = 0;  // 初始化车速为 0
	    }

	    public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		// 汽车加速
	    public void accelerate() {
	        // 每次加速车速增加 10 km/h
	        this.speed += 10;
	        System.out.println("汽车加速,当前车速为：" + this.speed + " km/h");

	        // 如果车速达到 100 km/h
	        if (this.speed >= 100) {
	            System.out.println("车速突破 100 km/h了，请注意！");
	        	}
	    	}
					}
