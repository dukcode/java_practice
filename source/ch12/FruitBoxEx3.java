import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class Juice {
    String name;

    public Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice getJuice(FruitBox<? extends Fruit> box) {
        StringBuilder tmp = new StringBuilder();
        for (Fruit fruit : box.getList()) {
            tmp.append(fruit.toString().concat(" "));
        }


        return new Juice(new String(tmp));
    }
}

class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.getJuice(fruitBox));
        System.out.println(Juicer.getJuice(appleBox));

    }
}
