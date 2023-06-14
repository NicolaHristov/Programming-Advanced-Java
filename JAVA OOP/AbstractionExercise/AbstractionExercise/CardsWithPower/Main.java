package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You will get a command consisting of two lines.
        // On the first line you will receive the Rank of the card and on the second line you will get the suit of the card.
        //Print the output in the format "Card name: ACE of SPADES; Card power: 53".

//        String rankOfcard=scanner.nextLine();//ACE
//        String suitOFCard=scanner.nextLine();//SPADES

//        System.out.printf("%s of %s; Card power: %d",rankOfcard,suitOFCard,);

        //CardsPower cardsPower= CardsPower.valueOf(scanner.nextLine());
        //        SuitPower suitPower= SuitPower.valueOf(scanner.nextLine());
        //
        //        int cardPower=cardsPower.getPower()+suitPower.getSuitPower();
        //
        //        //: "Card name: {card name} of {suit name}; Card power: {power of rank + power of suit}".
        //        System.out.printf("Card name: %s of %s; Card power: %d",cardsPower,suitPower,cardPower);

        CardRank rankPower= CardRank.valueOf(scanner.nextLine());
        CardSuit suitPower= CardSuit.valueOf(scanner.nextLine());

        int cardPower=rankPower.getCardPower() + suitPower.getSuitCardPower();

        System.out.printf("Card name: %s of %s; Card power: %d",rankPower,suitPower,cardPower);
    }
}
