package exercise.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RLock {

    public static void main(String[] args) throws Exception {

        RLock rLock = new RLock();

        rLock.testRLock();
    }


    Lock lock = new ReentrantLock();


    Condition condition = lock.newCondition();

    Condition condition2 = lock.newCondition();


    public void testRLock() throws Exception {

        lock.lock();

        condition.await();

        condition.await(10, TimeUnit.SECONDS);

        lock.unlock();


    }


}
