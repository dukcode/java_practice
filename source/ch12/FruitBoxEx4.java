import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Fruit {
    String name;
    int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple extends Fruit {
    public Apple(String name, int weight) {
        super(name, weight);
    }
}

class Grape extends Fruit {
    public Grape(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple> {
    public int compare(Apple t1, Apple t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape> {
    public int compare(Grape t1, Grape t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2) {
        return t2.weight - t1.weight;
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 200));
        appleBox.add(new Apple("GreenApple", 100));

        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));
        grapeBox.add(new Grape("GreenGrape", 100));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int idx) {
        return list.get(idx);
    }

    int size() {
        return list.size();
    }

    ArrayList<T> getList() {
        return list;
    }

    public String toString() {
        return list.toString();
    }
}

