package lesson27.part5a;

public class Consumer extends Thread {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.consume();
                Thread.sleep(1000); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}