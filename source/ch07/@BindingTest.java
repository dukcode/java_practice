// 07-18 BindingTest.java

class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        // Parent의 x (참조변수 따라감)
        System.out.println("p.x = " + p.x);
        p.method();
        // Child의 x (참조변수 따라감)
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;
    int y = 200;

    void method() {
        System.out.println("Parent Method, x = " + x + ", y = " + y);
    }
}

class Child extends Parent {
    int x = 300;

    void method() {
        // this 생략됨을 기억해야함
        // System.out.println("Child Method, x = " + this.x + ", y = " + y);
        System.out.println("Child Method, x = " + x + ", y = " + y);
    }
}

// [result]
// p.x = 100
// Child Method, x = 300, y = 200
// c.x = 300
// Child Method, x = 300, y = 200
