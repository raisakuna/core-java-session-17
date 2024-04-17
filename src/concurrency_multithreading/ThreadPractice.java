package concurrency_multithreading;

public class ThreadPractice {
    public static void main(String[] args) {
        // New State
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        t1.start();  // Runnable state-> doesn't mean it is running, we are giving this to Operating System
        t2.start();  // This 3 threads are running parallel.
        t3.start();
    }
}
