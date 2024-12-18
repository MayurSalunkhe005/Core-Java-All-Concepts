package threadclass;

class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000); // Pause the thread for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        //MyThread thread2 = new MyThread();

        thread1.setName("Book Ticket");
        //thread2.setName("Thread 2");

        thread1.start(); // Start the first thread
        //thread2.start(); // Start the second thread
    }
}

