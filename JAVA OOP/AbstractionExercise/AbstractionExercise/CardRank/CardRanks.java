package CardRank;

public enum CardRanks {
    //Create an enumeration type that has as its constants the thirteen ranks of a deck of playing cards
    // (ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING).
    // Iterate over the values of the enumeration type and print all ordinal values and names.

    ACE("Ace",0),
    TWO("Two",1),
    THREE("Three",2),
    FOUR("Four",3),
    FIVE("Five",4),
    SIX("Six",5),
    SEVEN("Seven",6),
    EIGHT("Eight",7),
    NINE("Nine",8),
    TEN("Ten",9),
    JACK("Jack",10),
    QUEEN("Queen",11),
    KING("King",12);

    String name;
    int power;

    CardRanks(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
