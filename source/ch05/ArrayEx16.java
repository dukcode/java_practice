// 05-16 ArrayEx16.java

class ArrayEx16
{
    public static void main(String[] args)
    {
        System.out.println("매개변수의 갯수 : " + args.length);

        for (int i = 0; i < args.length; ++i)
        {
            System.out.println("args[" + i + "] = \"" + args[i] + "\", 길이 : " + args[i].length());
        }
    }
}
