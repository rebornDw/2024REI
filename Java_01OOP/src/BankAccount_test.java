public class BankAccount_test {
    public static void main(String[] args) {
        Bank account = new Bank(); // 正しいクラスをインスタンス化
        account.deposit(1000); // 入金
        account.withdraw(500); // 出金
        System.out.println("残高: " + account.getBalance()); // 残高を表示
    }
}