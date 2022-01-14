// 09-06 CardToString2.java

class Card
{
    String kind;
    int number;

    Card()
    {
        this("SPACE", 1);
    }

    Card(String kind, int number)
    {
        this.kind = kind;
        this.number = number;
    }

    public String toString()
    {
        return "kind : " + kind + ", number : " + number;
    }
}

class CardToString2
{
    public static void main(String[] args)
    {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
