import java.util.List;
import java.util.ArrayList;

class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "1234567890abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 1);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }

        System.out.println("result : ");
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
    }
}
