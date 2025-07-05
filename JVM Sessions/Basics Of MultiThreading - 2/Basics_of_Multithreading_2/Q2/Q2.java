package Basics_of_Multithreading_2.Q2;


import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
public class Q2 {

    public static void main(String[] args) throws InterruptedException {
        Account a1 = new Account("1234", 100000.0);
        Account a2 = new Account("5678", 200000.0);
        Q2 transferHelper = new Q2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                transferHelper.transfer(a1, a2, 100.0);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                transferHelper.transfer(a2, a1, 100.0);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final A1 Balance: " + a1.getAmount());
        System.out.println("Final A2 Balance: " + a2.getAmount());
    }

    private void transfer(Account from, Account to, double amount) {
        try {
            if (from.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                try {
                    if (to.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                        try {
                            if (from.getAmount() >= amount) {
                                from.setAmount(from.getAmount() - amount);
                                to.setAmount(to.getAmount() + amount);
                            }
                        } finally {
                            to.getLock().unlock();
                        }
                    }
                } finally {
                    from.getLock().unlock();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Best practice
        }
    }
}


class Account {
    private String accountNumber;
    private double amount;
    private final ReentrantLock lock = new ReentrantLock();

    public Account(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ReentrantLock getLock() {
        return lock;
    }
}
