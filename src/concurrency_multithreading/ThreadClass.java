package concurrency_multithreading;

public class ThreadClass {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());
        System.out.println("------------------");
        getThreadInfo(currentThread);
    }

    public static void getThreadInfo(Thread thread){
        System.out.println("Thread id: " + thread.getId());
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread state: " + thread.getState());
        System.out.println("Thread group: " + thread.getThreadGroup());
    }
}
