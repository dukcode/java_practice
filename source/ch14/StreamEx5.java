package ch14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {

    public static void main(String[] args) {
        String[] strArr = {
            "Inheritance", "Java", "Lambda", "stream",
            "OptionalDouble", "IntStream", "count", "sum"
        };
        Stream.of(strArr).forEach(System.out::println);
        System.out.println();

        boolean isEmpty = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        String firstWordStartWithS = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst().orElse("");
        System.out.println("isEmpty : " + isEmpty);
        System.out.println("firstWordStartWithS : " + firstWordStartWithS);

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);
        int max = intStream3.reduce(Integer::max).getAsInt();
        int min = intStream4.reduce(Integer::min).getAsInt();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    
}
