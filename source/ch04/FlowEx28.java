// 04-28 FlowEx28.java
import java.util.*;

class FlowEx28
{
    public static void main(String[] args)
    {
        int input = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.print("1과 100사이의 정수를 입력하시오 > ");
            input = scanner.nextInt();

            if (input > answer)
            {
                System.out.println("더 작은 수로 다시 시도해보시오.");
            }
            else if (input < answer)
            {
                System.out.println("더 큰 수로 다시 시도해보시오.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
