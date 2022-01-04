// 06-24 CarTest2.java

class Car
{
    String color;
    String gearType;
    int door;

    Car()
    {
        this("white", "auto", 4);
    }

    Car(String c, String g, int d)
    {
        color = c;
        gearType = g;
        door = d;
    }

    Car(String color)
    {
        this(color, "auto", 4);
    }

    void printInfo()
    {
        System.out.println(color + " " + gearType + " " + door);
    }
}

class CarTest2
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        c1.printInfo();
        c2.printInfo();
    }
}
