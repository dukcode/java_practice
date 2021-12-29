// 05-03 ArrayEx03.java
import java.util.*;

class ArrayEx03
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = i + 1;
        }

        System.out.println("[변경전]");
        System.out.println("arr.length : " + arr.length);
        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; ++i)
        {
            tmp[i] = arr[i];
        }

        arr = tmp;

        System.out.println("[변경후]");
        System.out.println("arr.length : " + arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
