// 06-12 ReferenceParamEx3.java
class ReferenceParamEx3
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr)
    {
        for (int e : arr)
        {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }
    
    static int sumArr(int[] arr)
    {
        int sum = 0;
        for (int e : arr)
        {
            sum += e;
        }

        return sum;
    }

    static void sortArr(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; ++i)
        {
            for (int j = 0; j < arr.length -1 -i; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

