import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    
    private String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J" ,"Q", "K", "A"};
    private List<String> deck = new ArrayList<>();

    public Cards() {
        
    }

    public void createNewDeck() {
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(String.format("%s of %s", rank, suit));
            }
        }

        for (String card : deck) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);

        for (String card : deck) {
            System.out.println(card);
        }
    }

    public void drawTopCard() {
        System.out.printf("Top Card Drawn: %s\n", deck.get(0));
    }

    public void discardTopCard() {
        System.out.printf("Top Card Drawn: %s\n", deck.get(0));
        deck.remove(0);
    }

    public void drawRandomCard() {
        int index = (int)(Math.random() * deck.size());
        System.out.printf("Random Card Drawn: %s\n", deck.get(index));
    }

    public void discardRandomCard() {
        int index = (int)(Math.random() * deck.size());
        System.out.printf("Random Card Drawn: %s\n", deck.get(index));
        deck.remove(index);
    }

    public int getDeckSize() {
        return deck.size();
    }
}