package JavaWork01;

public class bank {
	public int ID;			//卡号
	public int pass;		//密码
	public float balance;	//余额
    public bank(int ID, int pass, float balance) {
        this.ID = ID;
        this.pass = pass;
        this.balance = balance;
    }
    //-------------取款方法---------------
	public float qukuan(float jinE) {
		if(jinE <= 0) {
			System.out.print("您输入的有误"+"\n");
			return -1;
		}else if(jinE > balance){
			System.out.print("您的余额不足"+"\n");
			return -1;
		}else {
			balance -= jinE;
			System.out.print("尊贵的客户"+this.ID+"您的余额为"+balance+"\n");
			return balance;
		}
	}
    //-------------存款方法---------------
	public float cunkuan(float jinE) {
		if(jinE <= 0) {
			System.out.print("您输入的有误");
			return -1;
		}else {
			balance += jinE;
			System.out.print("尊贵的客户"+this.ID+"您的余额为"+balance+"\n");
			return balance;
		}
	}
}
