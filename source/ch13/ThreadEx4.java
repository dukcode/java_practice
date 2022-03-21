package ch13;

/**
 * ThreadEx4
 */
public class ThreadEx4 {
    public static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {

        for (int i = 0; i < 1000; ++i) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 1000; ++i) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }
}
