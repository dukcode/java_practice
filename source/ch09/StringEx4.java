import java.util.StringJoiner;

class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog, cat, bear";
        String[] arr = animals.split(", ");

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        StringJoiner sj2 = new StringJoiner(" | ", "{", "}");
        for (String s : arr) {
            sj.add(s);
            sj2.add(s);
        }
        System.out.println(sj);
        System.out.println(sj2);
        System.out.println();

        sj.merge(sj2);
        System.out.println(sj);
    }
}
