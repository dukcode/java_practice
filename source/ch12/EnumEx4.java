class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {
        return ordinal;
    }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    public int compareTo(T t) {
        return ordinal - t.ordinal();
    }
}

abstract class MyTransportation extends MyEnum<MyTransportation> {
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation SHIP = new MyTransportation("SHIP", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE;
    abstract int fare(int distance);

    private MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {
        return name;
    }

    public String toString() {
        return name;
    }
}

public class EnumEx4 {
    public static void main(String[] args) {
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.TRAIN;
        MyTransportation t3 = MyTransportation.SHIP;
        MyTransportation t4 = MyTransportation.AIRPLANE;
        MyTransportation t5 = MyTransportation.BUS;

        System.out.println(t1.name() + ", " + t1.ordinal());
        System.out.println(t2.name() + ", " + t2.ordinal());
        System.out.println(t3.name() + ", " + t3.ordinal());
        System.out.println(t4.name() + ", " + t4.ordinal());

        System.out.println("t1 == t5 ? " + (t1 == t5));
        System.out.println("t1.compareTo(t3) = " + (t1.compareTo(t3)));
    }
}
