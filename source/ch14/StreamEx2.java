package ch14;

import java.io.File;
import java.util.stream.Stream;

/**
 * StreamEx2
 */
public class StreamEx2 {

	public static void main(String[] args) {
        File[] fileArr = new File("/Users/dukcode").listFiles();

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(s -> System.out.println());
            
        fileStream = Stream.of(fileArr);
        fileStream.map(File::getName)
            .filter(name -> name.indexOf('.') != -1)
            .map(name -> name.substring(name.indexOf('.') + 1))
            .map(String::toUpperCase)
            .distinct()
            .forEach(System.out::println);


    }
}
