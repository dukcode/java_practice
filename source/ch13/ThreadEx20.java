package ch13;

/**
 * ThreadEx20
 */
public class ThreadEx20 {

    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();


        for (int i = 0; i < 20; ++i) {
            int requiredMemory = (int)(Math.random() * 10) * 20;    // 0, 20, 40, 60, ... 160, 180

            if (requiredMemory > gc.freeMemory() || gc.freeMemory() < gc.totalMemory() * 0.4) {
                // 깨워 놓고
                gc.interrupt();
                try {
                    // 작업시간 주기
                    gc.join(100);
                } catch (InterruptedException e) {
                }
            }

            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory : " + gc.usedMemory + ", freeMemory : " + gc.freeMemory());
        }

    }
}

class ThreadEx20_1 extends Thread {
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt().");
            }
            gc();
            System.out.println("Garbage Collected. Free Memory : " + freeMemory());
        }

    }


    public void gc() {
        usedMemory -= 300;
        if (usedMemory < 0) {
            usedMemory = 0;
        }
    }

    public int totalMemory() {
        return MAX_MEMORY;
    }

    public int freeMemory() {
        return MAX_MEMORY - usedMemory;
    }
}
