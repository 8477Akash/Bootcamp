package Basics_of_Multithreading_1.Q4;
public class Q4 {
    public static void main(String[] args) throws InterruptedException {

        Account a1 = new Account("1234", 100000.0);
        Account a2 = new Account("5678", 200000.0);

        Q4 d1 = new Q4();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("From begin");
                for (int i = 0; i < 500; i++) {
                    d1.transfer(a1,a2,100.0);
                }
                System.out.println("From end");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("to begin");
                for (int i = 0; i < 500; i++) {
                    d1.transfer(a2,a1,100.0);
                }
                System.out.println("to end");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    private  void transfer(Account from, Account to, Double amount) {
        //applying lock
        synchronized (from.getLock()) {
            //So that acid properties are maintained -
            synchronized (to.getLock()) {
                System.out.println("From : " + from.getAmount());
                System.out.println("To : " + to.getAmount());
                to.setAmount(to.getAmount() + amount);
                from.setAmount(from.getAmount() - amount);

            }
        }
    }
}


class Account{
    private String accountNumber;
    private Double amount;
    private Object lock;

    public Account(String accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.lock = new Object();

    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getAmount() {
        return amount;

    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Object getLock() {
        return lock;
    }
    public void setLock(Object lock) {
        this.lock = lock;
    }
}

