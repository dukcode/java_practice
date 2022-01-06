// 07-14 SingletoneTest.java

class Singletone {
    private static Singletone s = new Singletone();
    public static int a = 0;

    private Singletone() {
        System.out.println("Singletone Constructor");
    }

    public static Singletone getInstance() {
        System.out.println("getInstance() 진입");
        if (s == null) {
            s = new Singletone();
        }

        return s;
    }
}

class SingletoneTest {
    public static void main(String[] args) {
        // int a = Singletone.a;
        System.out.println("main() start");
        Singletone s;
        System.out.println("class load?");

        // 멤버변수나 메서드에 진입할 때가 클래스 로드가 필요할 때이다
        s = Singletone.getInstance();
        System.out.println("after getInstance()");

        // 자바 클래스들은 시작 시 한번에 로드되지 않고, 애플리케이션에서 필요할 때 로드된다.
        // 클래스 로더는 JRE의 일부로써 런타임에 클래스를 동적으로 JVM에 로드 하는 역할을 수행하는 모듈이다.
        // 자바의 클래스들은 자바 프로세스가 새로 초기화되면 클래스로더가 차례차례 로딩되며 작동한다
    }
}
