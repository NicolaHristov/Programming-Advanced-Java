package AbstractionExercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Arrays.stream(Cards.values()).
//        System.out.println("Card Suits:");
//        Arrays.stream(Cards.values()).forEach( e -> System.out.println("Ordinal value: "+e.getValues()+"; "+"Name value: "+e.getName()));

        System.out.println("Card Suits:");
        for (CardSuit currentCard:CardSuit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",currentCard.ordinal(),currentCard.name());
        }


    }
}
