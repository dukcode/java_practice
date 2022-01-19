import java.util.Arrays;

class CloneEx2
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}

