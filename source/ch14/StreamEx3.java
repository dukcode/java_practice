package ch14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {

    public static void main(String[] args) {
        Student[] studentArr = {
            new Student("a자바", 3, 300),
            new Student("b자바", 1, 200),
            new Student("c자바", 2, 100),
            new Student("d자바", 2, 150),
            new Student("e자바", 1, 200),
            new Student("f자바", 3, 290),
            new Student("g자바", 3, -1240)
        };

        Stream<Student> studentStream = Stream.of(studentArr);

        studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
            .forEach(System.out::println);

        studentStream = Stream.of(studentArr);
        IntStream stuScoreStream = studentStream.mapToInt(Student::getTotalScore);


        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();

        System.out.println("count : " + stat.getCount());
        System.out.println("sum : " + stat.getSum());
        System.out.printf("average : %.2f%n", stat.getAverage());
        System.out.println("min : " + stat.getMax());
        System.out.println("max : " + stat.getMin());
        
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public String getName() { return name; }
    public int getBan() { return ban; }
    public int getTotalScore() { return totalScore; }

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
    

	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}

}
