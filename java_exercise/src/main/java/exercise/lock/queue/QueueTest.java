package exercise.lock.queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueTest {


    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<Integer>(10);

        blockingDeque.offer(10, 100, TimeUnit.MILLISECONDS);

        Random random = new Random();

        new Thread(() -> {

            while (true) {
                if (blockingDeque.offer(random.nextInt())) {
                    System.out.println("failed");
                }
            }


        }, "T-A").start();


        new Thread(() -> {

            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + "==" + blockingDeque.poll(100, TimeUnit.MILLISECONDS));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }, "T-B").start();


    }


}
