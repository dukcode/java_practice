import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Arrays.setAll(arr, (i) -> (int)(Math.random() * 5) + 1);
        System.out.println(Arrays.toString(arr));
    }
}
