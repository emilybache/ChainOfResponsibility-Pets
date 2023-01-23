package codingdojo;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var allBaits = Map.of(
                1, Bait.POPCORN,
                2, Bait.SAUSAGE,
                3, Bait.CHOCOLATE_CAKE
        );
        var scanner = new Scanner(System.in);
        System.out.println("What kind of bait do you want to use in your trap?");
        for (Map.Entry<Integer, Bait> bait: allBaits.entrySet()) {
            System.out.printf("    %s - %s%n", bait.getKey(), bait.getValue());
        }
        var baitString = scanner.nextLine();
        int baitChoice = Integer.parseInt(baitString);
        if (baitChoice < 1 || baitChoice > 3) {
            System.out.println("You don't have that bait. Try again.");
            return;
        }
        Bait bait = allBaits.get(baitChoice);
        var chainOfResponsibility = new Hamster(new Cat(new Dog(null)));
        System.out.println("The bait was taken! Trap contents: " + chainOfResponsibility.handleTrap(bait));
    }
}
