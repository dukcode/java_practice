enum Direction {
    EAST(1, ">"),
    SOUTH(2, "V"),
    WEST(3, "<"),
    NORTH(4, "^");
    
    private static final Direction[] DIR_ARR = Direction.values();

    public static Direction of(int dir) {
        if (dir < 1 || 4 < dir) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }


    private final int value;
    private final String symbol;

    private Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public Direction rotate(int num) {
        num %= 4;

        if (num < 0) {
            num += 4;
        }

        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }
}

public class EnumEx2 {
    public static void main(String[] args) {
        for (Direction dir : Direction.values()) {
            System.out.printf("%s = %d (순서 : %d)\n", dir.name(), dir.getValue(), dir.ordinal());
        }

        Direction d1 = Direction.of(1);
        Direction d2 = Direction.NORTH;

        System.out.println(d1);
        System.out.println(d1.rotate(1));
        System.out.println(d1.rotate(-2));
        System.out.println(d2);
    }
    
}
