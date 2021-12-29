// 03-02 OperatorEx2.java
class OperatorEx2
{
    public static void main(String[] args)
    {
        int i = 5;
        int j = 0;

        j = i++;
        System.out.println("i = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("i = ++i 실행 후, i = " + i + ", j = " + j);
    }
}
