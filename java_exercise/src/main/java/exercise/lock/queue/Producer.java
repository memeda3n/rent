package exercise.lock.queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {


    private Random random = new Random(100);

    private BlockingQueue<Data> blockingDeque;


    public Producer(BlockingQueue<Data> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }


    @Override
    public void run() {

        while (true) {
            Data data = new Data(random.nextInt(), "a");
            if (!blockingDeque.offer(data)){
                try {
                    Thread.sleep(1000);
                    System.out.println("睡了一秒:"+blockingDeque.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
