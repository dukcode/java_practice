// 05-13 ArrayEx13.java

class ArrayEx13
{
    public static void main(String[] args)
    {
        char[] hex = {'C', 'A', 'F', 'E'};
        String[] binary = {"0000", "0001", "0010", "0011"
                         , "0000", "0001", "0010", "0011"
                         , "0000", "0001", "0010", "0011"
                         , "0000", "0001", "0010", "0011"};
        String result = new String();

        for (int i = 0; i < hex.length; ++i)
        {
            if (hex[i] >= '0' && hex[i] <= '9')
            {
                result += binary[hex[i] - '0'];
            }
            else
            {
                result += binary[hex[i] - 'A'] + 10;
            }
        }

        System.out.println("hex : " + new String(hex));
        System.out.println("result : " + result);

    }
}
