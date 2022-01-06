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

        // 207p
        // 둘다 가능
        String name = new String("Kim");
        String names = "Kim";   // String에 대한 예외

        // 208p
        // String클래스의 주요 메서드
        char charAt(int index);
        int length();
        String substring(int from, int to);
        boolean equals(Object obj);
        char[] toCharArray();

        // 210p [05-14]
        System.println(chArr); // ABCDE         -> 내용 나옴(예외)
        System.println(intArr); // [I@18b4aac2  -> 주소와 타입 나옴

        // 213p
        System.exit(0);

        // 213p
        Integer.parseInt(args[i]);

        /// 227p 입력
        import java.util.*;
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        // 320p
        // ch07 07-03 DeckTest.java
        // String toString() 메서드가 구현되어 있으면 println에 사용 가능
        Card c = d.pick(0);
        System.out.println(c.toString());
        // System.out.println(c);   // 도 가능

        // static member 명시적 초기화 시점 언제인가?
    }
}
