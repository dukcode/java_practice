package ch14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static final Consumer<Integer> printlnInteger = System.out::println;
    public static final IntConsumer printlnInt = System.out::println;

    public static void main(String[] args) {
        IntStream intStream = new Random().ints(0, 10).limit(5);
        intStream.forEach(printlnInt);
        System.out.println();

        Stream<Integer> evenStream = Stream.iterate(0, i -> i + 2).limit(10);
        evenStream.forEach(printlnInteger);
        System.out.println();

        Stream<Integer> evenStreamOver5 = Stream.iterate(0, i -> i + 2).limit(10).filter(i -> i >= 5);
        evenStreamOver5.forEach(printlnInteger);
        System.out.println();

        Stream<Integer> emptyStream = Stream.empty();
        long count = emptyStream.count();
        System.out.println();

        Stream<Integer> integerStream = Arrays.asList(1, 2, 3, 4, 5).stream().sorted((i, j) -> j - i);
        integerStream.forEach(printlnInteger);
        System.out.println();

        Stream<Integer> randomIntegerStream = Stream.generate(() -> (int)(Math.random() * 10)).limit(30).distinct().sorted();
        randomIntegerStream.forEach(printlnInteger);
        System.out.println();
    }


}
