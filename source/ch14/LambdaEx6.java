package ch14;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
    private static IntSupplier getRandomInt = () -> ((int)(Math.random() * 100));
    private static IntConsumer printInt = (i) -> System.out.print(i + ", ");
    private static IntPredicate isEvenNum = (i) -> i % 2 == 0;
    private static IntUnaryOperator removeUnits = (i) -> (i / 10) * 10;

    public static void main(String[] args) {
        int[] arr = new int[10];

        makeRandomArray(arr);
        System.out.println(Arrays.toString(arr));

        printEvenNum(arr);

        removeUnitsOfNums(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void makeRandomArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = getRandomInt.getAsInt();
        }
    }

    public static void printEvenNum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (isEvenNum.test(arr[i])) {
                printInt.accept(arr[i]);
            }
        }
        System.out.println();
    }

    public static void removeUnitsOfNums(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = removeUnits.applyAsInt(arr[i]);
        }
    }
    
}
