// 05-12 ArrayEx12.java

class ArrayEx12
{
    public static void main(String[] args)
    {
        String[] names = new String[] {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; ++i)
        {
            System.out.println("names[" + i + "] : " + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp : " + tmp);
        tmp = "str";
        System.out.println("tmp : " + tmp);
        names[0] = "Yu";

        for (int i = 0; i < names.length; ++i)
        {
            System.out.println("names[" + i + "] : " + names[i]);
        }
    }
}
