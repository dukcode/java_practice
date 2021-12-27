// 02-07 CharToCode.java
class CharToCode
{
    public static void main(String[] args)
    {
        char ch = 'A';
        int code = (int)ch;
        System.out.printf("%c = %d(%#06X)%n", ch, code, code);

        char hanCh = '가';
        System.out.printf("%c = %d(%#06X)%n", hanCh, (int)hanCh, (int)hanCh);
    }
}
