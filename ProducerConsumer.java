//producer & consumer
import java.util.LinkedList;
import java.util.Queue;

// Shared Buffer Class
class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Method for Producer to produce an item
    public synchronized void produce(int value) throws InterruptedException {
        // Wait if buffer is full
        while (queue.size() == capacity) {
            System.out.println("Buffer is full, producer waiting...");
            wait();
        }

        // Produce and notify consumers
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that the buffer is not empty
    }

    // Method for Consumer to consume an item
    public synchronized int consume() throws InterruptedException {
        // Wait if buffer is empty
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty, consumer waiting...");
            wait();
        }

        // Consume and notify producers
        int value = queue.remove();
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer that the buffer is not full
        return value;
    }
}

// Producer class
class Producer implements Runnable {
    private Buffer buffer;
    private int maxProduction = 10; // Number of items to produce

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            for (int i = 0; i < maxProduction; i++) {
                buffer.produce(value++); // Produce a new item
                Thread.sleep(1000); // Simulate time delay in production
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private Buffer buffer;
    private int maxConsumption = 10; // Number of items to consume

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < maxConsumption; i++) {
                buffer.consume(); // Consume an item
                Thread.sleep(1500); // Simulate time delay in consumption
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main class to execute the producer-consumer problem
public class ProducerConsumer {
    public static void main(String[] args) {
        // Create a buffer with a capacity of 5
        Buffer buffer = new Buffer(5);

        // Create and start Producer and Consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();

        // Wait for producer and consumer to finish
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Production and consumption completed.");
    }
}
