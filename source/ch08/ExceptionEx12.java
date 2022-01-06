// 08-12 ExceptionEx12.java

class ExceptionEx12
{
    public static void main(String[] args) throws Exception
    {
        try
        {
        method1();
        }
        catch (Exception e)
        {
            System.out.println("Exception 발생");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception
    {
        method2();
    }

    static void method2() throws Exception
    {
        throw new Exception();
    }
}
