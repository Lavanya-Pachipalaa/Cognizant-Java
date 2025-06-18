class UsingThread extends Thread {
    private String msg;
    public UsingThread(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(msg + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted.");
            }
        }
    }
}
class UsingRunnable implements Runnable {
    private String msg2;

    public UsingRunnable(String msg2) {
        this.msg2 = msg2;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(msg2 + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted.");
            }
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        UsingThread thread1 = new UsingThread("Thread 1");
        Thread thread2 = new Thread(new UsingRunnable("Thread 2"));
        thread1.start();
        thread2.start();
    }
}
