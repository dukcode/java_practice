package ch13;
/**
 * ThreadEx3
 */
public class ThreadEx3 {

    public static void main(String[] args) {
        ThreadEx3_1 t = new ThreadEx3_1();
        t.run();
    }
}

class ThreadEx3_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

	private void throwException() {
        try {
            throw new Exception();
        } catch(Exception e) {
            e.printStackTrace();
        }
	}

}
