// 07-03 DeckTest.java

class DeckTest
{
    public static void main(String[] args)
    {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c.toString());
        // System.out.println(c);   // 도 가능

        d.shuffle();
        System.out.println(c.toString());
        c = d.pick(0);
        System.out.println(c.toString());

        d.shuffle();
        System.out.println(c.toString());
        c = d.pick(0);
        System.out.println(c.toString());
    }
}

class Deck
{
    static final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    Deck()
    {
        int i = 0;

        for (int k = 1; k <= Card.KIND_MAX; ++k)
        {
            for (int n = 0; n < Card.NUM_MAX; ++n)
            {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    }

    Card pick(int index)
    {
        return cardArr[index];
    }

    Card pick()
    {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle()
    {
        for (int i = 0; i < CARD_NUM; ++i)
        {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

}

class Card
{
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int CLOVER = 1;
    static final int HEART = 2;
    static final int DIAMOND = 3;
    static final int SPADE = 4;

    int kind;
    int number;

    Card()
    {
        this(SPADE, 1);
    }

    Card(int kind, int number)
    {
        this.kind = kind;
        this.number = number;
    }

    public String toString()
    {
        String[] kinds = new String[] {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = new String("0123456789XJQK");

        return "kind : " + kinds[kind] + ", number : " + numbers.charAt(number);
    }
}
