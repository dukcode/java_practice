package ch13;

/**
 * ThreadEx8
 */
public class ThreadEx8 {

    public static void main(String[] args) {
        ThreadEx8_1 t1 = new ThreadEx8_1();
        ThreadEx8_2 t2 = new ThreadEx8_2();

        t1.setPriority(7);

        System.out.println("Priority of t1 : " + t1.getPriority());
        System.out.println("Priority of t2 : " + t2.getPriority());

        t1.start();
        t2.start();
    }
}

/**
 * ThreadEx8_1
 */
class ThreadEx8_1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; ++i) {
            System.out.print("|");
            for (int x = 0; x < 10000000; ++x) {
            }
        }

    }

}

/**
 * ThreadEx8_2
 */
class ThreadEx8_2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; ++i) {
            System.out.print("-");
            for (int x = 0; x < 10000000; ++x) {
            }
        }
    }

}
