package CardsWithPower;

public enum CardSuit {

    //Suit powers are as follows: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).
    CLUBS("Clubs",0),
    DIAMONDS("Diamonds",13),
    HEARTS("Hearts",26),
    SPADES("Spades",39);

    String suitCardName;
    int suitCardPower;

    CardSuit(String suitCardName, int suitCardPower) {
        this.suitCardName = suitCardName;
        this.suitCardPower = suitCardPower;
    }

    public String getSuitCardName() {
        return suitCardName;
    }

    public int getSuitCardPower() {
        return suitCardPower;
    }
}
