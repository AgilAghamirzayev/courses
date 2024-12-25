package lesson27.part5a;

class Producer extends Thread {
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int item = 0;
        try {
            while (true) {
                resource.produce(item++);
                Thread.sleep(500); // Simulate production time
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }
}