package ch14;

@FunctionalInterface
interface MyFunction {
    public abstract void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object obj = (MyFunction)(() -> {});
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
        System.out.println(new MyFunction() { public void myMethod() {} });
    }
}
