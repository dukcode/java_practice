// 07-07 PointTest.java

class PointTest {
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 2);
        Point3D p2 = new Point3D(2, 4, 6);

        System.out.println(p1.getLocation());
        System.out.println(p2.getLocation());
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z : " + z;
    }
}
