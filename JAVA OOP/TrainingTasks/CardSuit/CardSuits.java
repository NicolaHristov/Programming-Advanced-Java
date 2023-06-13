package CardSuit;

public enum CardSuits {
    //Create an enumeration type that has as its constants the four suits of a deck of playing cards (CLUBS, DIAMONDS, HEARTS, SPADES).
    // Iterate over the values of the enumeration type and print all ordinal values and names.

    //Ordinal value: 0; Name value: CLUBS
    //Ordinal value: 1; Name value: DIAMONDS
    //Ordinal value: 2; Name value: HEARTS
    //Ordinal value: 3; Name value: SPADES

    CLUBS("CLUBS",0),
    DIAMONDS("DIAMONDS",1),
    HEARTS("HEARTS",2),
    SPADES("SPADES",3);

    String cardName;
    int cardValue;

    CardSuits(String cardName, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
