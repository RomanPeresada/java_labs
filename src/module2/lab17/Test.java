package module2.lab17;

import java.util.concurrent.*;

class TestCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 15; i++) {
            System.out.println("hello " + i + " " + Thread.currentThread().getName());
        }
        return " only for u";
    }
}

class TestRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started working " +System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished working " +System.currentTimeMillis());
    }
}


public class Test {
    public static void main(String[] args) throws InterruptedException {

        TestRunnable runnable = new TestRunnable();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.scheduleAtFixedRate(runnable,1,3,TimeUnit.SECONDS);


        Thread.sleep(10000);
        executorService.shutdown();

        System.out.println("other scheduled");
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(3);

        executor.scheduleWithFixedDelay(runnable,1,3,TimeUnit.SECONDS);
        Thread.sleep(10000);
        executor.shutdown();

//        ExecutorService service1 = Executors.newSingleThreadExecutor();
//        ExecutorService service2 = Executors.newSingleThreadExecutor();
//
//        Future<String> future2 = service1.submit(new TestCallable());
//        Future<?> future = service2.submit(new TestCallable());
//        try {
//            System.out.println(future.get());
//            System.out.println(future2.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        service1.shutdown();
//        service2.shutdown();
    }
}
