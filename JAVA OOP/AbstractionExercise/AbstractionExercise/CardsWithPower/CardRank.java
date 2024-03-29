package CardsWithPower;

public enum CardRank {

    ACE("Ace",14),
    TWO("Two",2),
    THREE("Three",3),
    FOUR("Four",4),
    FIVE("Five",5),
    SIX("Six",6),
    SEVEN("Seven",7),
    EIGHT("Eight",8),
    NINE("Nine",9),
    TEN("Ten",10),
    JACK("Jack",11),
    QUEEN("Queen",12),
    KING("King",13);

    String cardName;
    int cardPower;

    CardRank(String cardName, int cardPower) {
        this.cardName = cardName;
        this.cardPower = cardPower;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardPower() {
        return cardPower;
    }
}
