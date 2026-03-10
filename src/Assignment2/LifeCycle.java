package Assignment2;

class LifeCycle extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        LifeCycle t = new LifeCycle();

        System.out.println("State: " + t.getState());

        t.start();
        System.out.println("State: " + t.getState());

        Thread.sleep(100);
        System.out.println("State: " + t.getState());

        t.join();
        System.out.println("State: " + t.getState());
    }
}
