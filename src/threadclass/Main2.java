package threadclass;

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}

class TransactionRunnable implements Runnable {
    private BankAccount account;
    private int amount;

    public TransactionRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}



public class Main2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread thread1 = new Thread(new TransactionRunnable(account, 500), "User 1");
        Thread thread2 = new Thread(new TransactionRunnable(account, 700), "User 2");
        Thread thread3 = new Thread(new TransactionRunnable(account, 600), "User 3");
        Thread t = Thread.currentThread();
        System.out.println(t.getName());//output main
        System.out.println(thread3.isAlive());
        thread1.start();
        thread2.start();
        thread3.start();
        
        MyThread t1 = new MyThread();
        t1.setName("Thread 1");

        // Start the thread - this calls run() method internally in a new thread
        t1.start();

        // Directly calling run() - runs the code in the main thread, not as a new thread
        t1.run();  // NOT recommended for starting a thread
        
    }
    
}

