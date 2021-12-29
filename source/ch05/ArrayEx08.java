// 05-08 ArrayEx08.java
import java.util.*;

class ArrayEx08
{
    public static void main(String[] args)
    {
        int[] balls = new int[45];
        for (int i = 0; i < balls.length; ++i)
        {
            balls[i] = i + 1;
        }

        int temp = 0;
        int j =0;

        for (int i = 0; i < 6; ++i)
        {
            j = (int)(Math.random() * 45);
            temp = balls[i];
            balls[i] = balls[j];
            balls[j] = temp;
        }

        for (int i = 0; i < 6; ++i)
        {
            System.out.print(balls[i] + " ");
        }
        System.out.println();
    }
}
