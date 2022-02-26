package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[] {"abc", "def", "jkl"},
                new String[] {"ABC", "GHI", "JKL"}
                );

        Stream<String> strString = strArrStream.flatMap(Arrays::stream);
        strString.map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
            "Believe or not It is true",
            "Do or not There is no try"
        };

        Stream<String> wordStream = Arrays.stream(lineArr).flatMap((line) -> Arrays.stream(line.split(" ")));
        wordStream.map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);
        System.out.println();

        Stream<String> strStream1 = Stream.of("123", "456", "789");
        Stream<String> strStream2 = Stream.of("abc", "def", "ghi");

        Stream<Stream<String>> strStreamStream = Stream.of(strStream1, strStream2);
        Stream<String> strStream3 = strStreamStream
            .map((strStream) -> strStream
            .toArray(String[]::new)).flatMap(Arrays::stream);

        strStream3.map(String::toLowerCase)
            .forEach(System.out::println);
        System.out.println();
    }
}
