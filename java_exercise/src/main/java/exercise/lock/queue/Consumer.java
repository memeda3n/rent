package exercise.lock.queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Data> blockingDeque;

    public Consumer(BlockingQueue<Data> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }


    @Override
    public void run() {

        try {

            while (true) {
                if (blockingDeque.size() > 0) {
                    System.out.println("消费："+Thread.currentThread().getName() + blockingDeque.poll());
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
