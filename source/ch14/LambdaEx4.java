package ch14;

import java.util.ArrayList;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(element -> System.out.print(element + ", "));
        System.out.println();

        list.removeIf(element -> element % 2 == 0 || element % 3 == 0);
        System.out.println(list);

        list.replaceAll(element -> element * 10);
        System.out.println(list);
    }
}

