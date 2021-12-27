// 02-11 FloatToBinEx.java
class FloatToBinEx
{
    public static void main(String[] args)
    {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);
        String s = Integer.toBinaryString(i);

        System.out.printf("%f%n", f);
        System.out.printf("%#x%n", i);
        System.out.printf("%s%n", Integer.toBinaryString(i));
        System.out.println(s.length());

        System.out.println();

        f *= -1;
        i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%#x%n", i);
        System.out.printf("%s%n", Integer.toBinaryString(i));
    }
}
