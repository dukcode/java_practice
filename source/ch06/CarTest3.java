// 06-26 CarTest3.java

class Car
{
    String color;
    String gearType;
    int door;

    Car()
    {
        this("white", "auto", 4);
    }

    Car(String color, String gearType, int door)
    {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c)
    {
        this(c.color, c.gearType, c.door);
        // color = c.color;
        // gearType = c.gearType;
        // door = c.door;
    }

    void printInfo()
    {
        System.out.println(color + " " + gearType + " " + door);
    }
}

class CarTest3
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        c1.printInfo();
        c2.printInfo();

        c1.door = 100;

        c1.printInfo();
        c2.printInfo();
    }
}
