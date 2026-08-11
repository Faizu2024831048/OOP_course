static class Wallet {
    private int balance;
    private final int id;
    private static int counter= 99100000;
    private String lastWithdraw ="None";
    public Wallet()
    {
        this(0);
    }
    public Wallet(int balance) {
        this.balance = balance;
        this.id=++counter;
    }
     int deposit(int amount)
    {
        return balance+amount;
    }
    void withdraw(int amount)
    {
        balance-=amount;
    }
    void withdraw(int amount,String mode)
    {
        lastWithdraw = mode;
        balance-=amount;
    }
    void addBonus(Wallet w)
    {
        w.balance=w.deposit(300);
    }

}
public static void main(String[] args){
    Wallet w1=new Wallet(1000);
    Wallet w2=new Wallet(2000);
    Wallet w3=new Wallet();
    w1.balance= w1.deposit(100);
    w1.withdraw(100);
    w2.withdraw(100);
    w2.withdraw(200,"ATM");
   w3.balance= w3.deposit(1000);
   w3.withdraw(100,"Bank");
   w3.addBonus(w3);
    System.out.println("id and balance of wallet 1: "+ w1.balance+" last withdraw with " +w1.lastWithdraw);
    System.out.println("id and balance of wallet 2: "+ w2.balance+ " last withdraw with "+w2.lastWithdraw);
    System.out.println("id and balance of wallet 3: "+ w3.balance+ " last withdraw with "+w3.lastWithdraw);
}

