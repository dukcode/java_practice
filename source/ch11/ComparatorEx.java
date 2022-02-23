import java.util.Comparator;
import java.util.Arrays;

class ComparatorEx {
    public static void main(String[] args) {
        System.out.println("start!!!");
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, (s1, s2) -> (((Comparable)s1).compareTo(s2)));
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, (s1, s2) -> (((Comparable)s1).compareTo(s2)) * -1);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Decending());
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new DecendingWithoutCase());
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}

class DecendingWithoutCase implements Comparator {
    public int compare(Object o1, Object o2) {
        return String.CASE_INSENSITIVE_ORDER.compare((String)o1, (String)o2) * -1;
    }
}

class Decending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return (c1.compareTo(c2)) * -1;
        }

        return -1;
    }
}
