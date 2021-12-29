// 05-10 ArrayEx10.java
class ArrayEx10
{
    public static void main(String[] args)
    {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; ++i)
        {
            System.out.printf("%2d ", numArr[i] = (int)(Math.random() * 50));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; ++i)
        {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 - i; ++j)
            {
                if (numArr[j] > numArr[j + 1])
                {
                    int tmp = numArr[j + 1];
                    numArr[j + 1] = numArr[j];
                    numArr[j] = tmp;
                    changed = true;
                }
            }

            if (changed == false)
            {
                break;
            }

            for (int k = 0; k < numArr.length; ++k)
            {
                System.out.printf("%2d ", numArr[k]);
            }
            System.out.println();
        }
    }
}
