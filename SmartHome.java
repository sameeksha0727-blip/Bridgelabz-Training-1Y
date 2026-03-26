class Device implements Runnable {
    private String name;
    private int time;

    public Device(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " working... Cycle: " + i);
            try {
                Thread.sleep(time);
            } catch (Exception e) {}
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature", 5000));
        Thread camera = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));

        camera.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        camera.start();
        light.start();
        door.start();
    }
}
