package OOP.Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardRank cardNumber = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        System.out.printf("Card name: %s of %s; Card power: %d", cardNumber.name(), cardSuit.name(), cardNumber.getPower() + cardSuit.getPower());
    }
}
