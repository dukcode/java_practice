// 07-23 PolyArgumentTest3.java
import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }

    Product() {}
}

class Tv extends Product {
    Tv() {
        super(100_0000);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200_0000);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50_0000);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000_0000;
    int bonusPoint = 0;
    Vector item = new Vector();
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을(를) 구입하셨습니다.");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을(를) 반품하셨습니다");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = new String("");

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); ++i) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += i == 0 ? p.toString() : new String(", ") + p.toString();
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.summary();
        
        System.out.println();
        b.refund(computer);
        b.summary();
    }
}

