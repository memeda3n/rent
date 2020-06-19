package exercise.lock;

public class ProduceConsumeTest {

    public static void main(String[] args) {


        Product product = new Product();

        Consumer consumer = new Consumer(product);

        Produce produce = new Produce(product);

        Thread produceThread = new Thread(() -> {
            System.out.println(consumer.consume());
        });

        produceThread.setName("produce");
        produceThread.start();
        Thread consumeThread = new Thread(() -> {
            System.out.println(produce.produce());
        });
        consumeThread.setName("produce");
        consumeThread.start();

    }
}
