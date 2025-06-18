import java.util.concurrent.*;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        Callable<String> t1 = () -> {
            Thread.sleep(1000);
            return "Task 1 completed";
        };
        Callable<String> t2 = () -> {
            Thread.sleep(2000);
            return "Task 2 completed";
        };
        Callable<String> t3 = () -> {
            Thread.sleep(1500);
            return "Task 3 completed";
        };
        Future<String> result1 = ex.submit(t1);
        Future<String> result2 = ex.submit(t2);
        Future<String> result3 = ex.submit(t3);
        try {
            System.out.println(result1.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error retrieving results: " + e.getMessage());
        }
        ex.shutdown();
    }
}
