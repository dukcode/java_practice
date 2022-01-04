// 05-14 ArrayEx14
class ArrayEx14
{
    public static void main(String[] args)
    {
        String src = new String("ABCDE");

        for (int i = 0; i < src.length(); ++i)
        {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + ") : " + ch);
        }

        char[] chArr = src.toCharArray();
        System.out.println(chArr);
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println(intArr);
    }
}
