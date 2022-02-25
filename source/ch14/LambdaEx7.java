package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * LambdaEx7
 */
public class LambdaEx7 {

    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

        Function<String, String> h = f.andThen(g);                  // B(hex) -> 11(dec) -> 1011(bin)
        Function<Integer, Integer> h2 = f.compose(g);                // 3(dec) -> 11(bin) -> 17(dec)

        System.out.println(h.apply("B"));
        System.out.println(h2.apply(3));

        Function<String, String> f2 = x -> x;
        System.out.println(f2.apply("abc"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();


        Predicate<Integer> all = notP.and(q.or(r));         // !(i < 100) && ((i < 200) || (i % 2 == 0)) -> (100 <= i) && ((i < 200) || (i % 2 == 0))
        System.out.println(all.test(50));                  // 50 -> false
        System.out.println(all.test(100));                   // 100 -> true
        System.out.println(all.test(151));                   // 151 -> true
        System.out.println(all.test(201));                   // 201 -> false
        System.out.println(all.test(202));                   // 202 -> true

    }
}
