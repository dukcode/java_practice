package ch13;

import java.util.ArrayList;

/**
 * ThreadWaitEx2
 */
public class ThreadWaitEx2 {

    public static void main(String[] args) {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        
        System.exit(0);
    }
}

class Customer implements Runnable {

    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

	@Override
	public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            String name = Thread.currentThread().getName();

            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " fail to eat " + food);
            }
        }
	}

    public boolean eatFood() {
        return table.remove(food);
    }
}

class Cook implements Runnable {

    private String[] menuOption = {"donut", "donut", "burger"};  // 도넛이 더 자주 나온다.
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    /**
     * 임의의 요리를 하나 만들고 1ms 쉰다.(반복)
     */
	@Override
	public void run() {
        while (true) {
            String menu = menuOption[(int)(Math.random() * menuOption.length)];
            table.add(menu);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

        }
	}

}

class Table {

    private final int MAX_FOOD = 3;

    private ArrayList<String> dishes = new ArrayList<>();
    
    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes);
    }

    public synchronized boolean remove(String dishName) {
        while (dishes.size() == 0) {
            String name = Thread.currentThread().getName();
            System.out.println("!!!!!!!!!!!!" + name + " is waiting.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        // 지정된 요리와 일치하는 요리는 테이블에서 제거한다.
        for (int i = 0; i < dishes.size(); ++i) {
            if (dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }
        }
        
        return false;
    }
}

