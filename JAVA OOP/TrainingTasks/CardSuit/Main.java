package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (CardSuits value : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.getCardValue(),value.getCardName());
        }
        System.out.println("Card Suits:");
        for (CardSuits value : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.ordinal(),value.name());
        }

        //  System.out.println("Card Ranks:");
        //        for (CardRank currentCardRank:CardRank.values()){
        //            System.out.printf("Ordinal value: %d; Name value: %s%n",currentCardRank.ordinal(),currentCardRank.name());
        //        }
    }
}
