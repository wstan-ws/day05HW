import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Cards deck = new Cards();
        Scanner scanner = new Scanner(System.in);
        boolean isLooping = true;

        System.out.println("Here's a set of poker cards.");

        while (isLooping) {
            String command = scanner.nextLine().trim().toLowerCase();
            switch (command) {
                case "create":
                    deck.createNewDeck();
                    break;
                case "shuffle":
                    if (deck.getDeckSize() <= 0) {
                        System.out.println("Please create a new deck before shuffling");
                    } else {
                    deck.shuffleDeck();
                    }
                    break;
                case "draw top":
                    if (deck.getDeckSize() <= 0) {
                        System.out.println("Please create a new deck before drawing");
                    } else {    
                        deck.drawTopCard();
                        System.out.println("Card has been returned to top of the deck");
                    }
                    break;
                case "discard top":
                    if (deck.getDeckSize() <= 0) {
                        System.out.println("Please create a new deck before drawing");
                    } else {    
                        deck.discardTopCard();
                        System.out.println("Card has been removed from deck");
                    }
                    break;
                case "draw random":
                    if (deck.getDeckSize() <= 0) {
                        System.out.println("Please create a new deck before drawing");
                    } else {    
                        deck.drawRandomCard();
                        System.out.println("Card has been returned to the deck");
                    }
                    break;
                case "discard random":
                    if (deck.getDeckSize() <= 0) {
                        System.out.println("Please create a new deck before drawing");
                    } else {    
                        deck.discardRandomCard();
                        System.out.println("Card has been removed from deck");
                    }
                    break;
                case "end":
                    isLooping = false;
                    break;
                default:
                    System.out.println("""
                            Invalid Command. Available Command:
                            - create
                            - shuffle
                            - draw top
                            - discard top
                            - draw random
                            - discard random
                            - end""");
            }
        }
        scanner.close();
    }
}