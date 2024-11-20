class Bank {
    private double balance; // 残高

    // 残高を取得する
    public double getBalance() {
        return balance;
    }

    // 入金メソッド
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("入金: " + amount);
        } else {
            System.out.println("正しい金額を入力してください");
        }
    }

    // 出金メソッド
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("出金: " + amount);
        } else {
            System.out.println("残高不足または無効な金額");
        }
    }
}

