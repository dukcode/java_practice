package ch13;

/**
 * ThreadEx5
 */
public class ThreadEx5 {

    public static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {

        ThreadEx5_1 t1 = new ThreadEx5_1();
        t1.start();

        for (int i = 0; i < 1000; ++i) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx5_1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
