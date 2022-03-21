package ch13;
/**
 * ThreadEx2
 */
public class ThreadEx2 {

    public static void main(String[] args) {
        ThreadEx2_1 t = new ThreadEx2_1();
        t.start();
    }
}

class ThreadEx2_1 extends Thread {
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
