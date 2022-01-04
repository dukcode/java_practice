// 06-24 CarTest.java

class Car
{
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d)
    {
        color = c;
        gearType = g;
        door = d;
    }

    void printInfo()
    {
        System.out.println(color + " " + gearType + " " + door);
    }
}

class CarTest
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;;

        Car c2 = new Car("white", "auto", 4);
        c1.printInfo();
        c2.printInfo();
    }
}
