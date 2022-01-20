class ParentClass
{
    public void foo() throws Exception
    {
        if (this instanceof MarkInterface == false)
        {
            throw new Exception("doesn't implement MarkInterface\n");
        }

        System.out.println("Do Shallow Copy");
    }
}

interface MarkInterface
{}

class ChildClass1 extends ParentClass implements MarkInterface
{
    public void foo()
    {
        try
        {
            super.foo();
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}

class ChildClass2 extends ParentClass
{
    public void foo()
    {
        try
        {
            super.foo();
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}


class Main
{
    public static void main(String args[])
    {
        ChildClass1 c1 = new ChildClass1();
        ChildClass2 c2 = new ChildClass2();

        c1.foo();
        c2.foo();
    }
}
