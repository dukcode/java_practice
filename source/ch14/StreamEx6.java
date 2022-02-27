package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamEx6
 */
public class StreamEx6 {

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

        List<String> names = Stream.of(studentArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

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
