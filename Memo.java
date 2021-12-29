// Memo.java
class Memo
{
    public static void main(String[] args)
    {
        // 0으로 초기화 됨
        int[] num = new int[5];


        int[] num = new int[5];
        int[] newNum = new int[10];
        // num[0]에서 newNum[0]으로 num.length개의 데이터 복사
        System.arrcopy(num, 0, newNum, 0, num.length);


        // import java.util.*;  // Arrays.toString()
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));


        // 0 <= Math.random() < 1
        // 0 ~ 9 사이의 난수 추출
        int ramdomNum = (int)(Math.random() * 10);


        // System.out.print(balls[i] + ' ');    // balls[i] + (int)' ' 출력됨
        System.out.print(balls[i] + " ");
    }
}
