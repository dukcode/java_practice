// Test.java

class Test
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("A");
            System.out.println(0 / 0);
        }
        // catch (ArrayIndexOutOfBoundsException e)
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("B");
        }
        finally
        {
            try
            {
                System.out.println(0 / 0);
            }
            catch (ArithmeticException e)
            {
                e.printStackTrace();
            System.out.println("C");
            }
        }
    }
}
