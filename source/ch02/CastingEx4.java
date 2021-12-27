// 02-15 CastingEx4.java

class CastingEx4
{
    public static void main(String[] args)
    {
        int i = 91234567;
        float f = (float) i;
        int i2 = (int)f;
        System.out.printf("i = %d%n", i);
        System.out.printf("f = %f, i2 = %d%n", f, i2);

        double d = (double)i;
        int i3 = (int)d;
        System.out.printf("d = %f, i3 = %d%n", d, i3);

        float f2 = 1.666f;
        int i4 = (int)f2;
        System.out.printf("(int)%f = %d%n", f2, i4);
    }
}
