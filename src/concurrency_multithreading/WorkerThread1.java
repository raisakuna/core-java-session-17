package concurrency_multithreading;

public class WorkerThread1 implements Runnable{

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i =0; i <5; i++){
            System.out.println("Worker Thread 1 running");
        }
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new WorkerThread1());
        thread1.start();

    }
}
