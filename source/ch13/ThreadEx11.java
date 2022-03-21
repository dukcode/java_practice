package ch13;

import java.util.Iterator;
import java.util.Map;


/**
 * ThreadEx11
 */
public class ThreadEx11 {

    public static void main(String[] args) {
        ThreadEx11_1 thread1 = new ThreadEx11_1("Thread1");
        ThreadEx11_2 thread2 = new ThreadEx11_2("Thread2");
        thread1.start();
        thread2.start();
    }
}

/**
 * ThreadEx11_1
 */
class ThreadEx11_1 extends Thread {
    
    ThreadEx11_1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(5 * 1000);
        } catch (InterruptedException e) {}
    }
}

/**
 * ThreadEx11_2
 */
class ThreadEx11_2 extends Thread {

    ThreadEx11_2(String name) {
        super(name);
    }

    @Override
    public void run() {
        Map<Thread, StackTraceElement[]> map = getAllStackTraces();
        Iterator<Thread> it = map.keySet().iterator();

        int x = 0;
        while (it.hasNext()) {
            Thread t = it.next();
            StackTraceElement[] ste = map.get(t);

            System.out.print("[" + ++x + "] name : " + t.getName());
            System.out.print(", group : " + t.getThreadGroup().getName());
            System.out.println(", demon : " + t.isDaemon());

            for (int i = 0; i < ste.length; ++i) {
                System.out.println(ste[i]);
            }
            System.out.println();
        }
    }
    
}

