package exercise.lock.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {


    public static void main(String[] args) {
        BlockingQueue queue=new ArrayBlockingQueue(10);

        new Thread(new Consumer(queue),"A").start();
        new Thread(new Consumer(queue),"B").start();
        new Thread(new Producer(queue),"C").start();


    }
}
