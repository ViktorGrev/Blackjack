package edu.ntnu.viktor;

import java.util.ArrayList;
import java.util.List;

/**
 * The DeckOfCards class represents a deck of playing cards.
 * It contains methods for creating a new deck of cards, dealing a hand of cards,
 * and retrieving all the cards in the deck.
 * Each card in the deck is represented by a PlayingCard object.
 */
public class DeckOfCards {
    private final char[] suits = { 'S', 'H', 'D', 'C' }; // 'S'=spade, 'H'=heart, 'D'=diamonds, 'C'=clubs
    private List<PlayingCard> cardDeck; //A List representing a card deck containing 52 card
    int randomNum; //A random number to pick a random card from the card deck

    /**
     * This constructor initializes a new DeckOfCards object with a full deck of 52 PlayingCard objects.
     * The deck is created by iterating over each suit and face value, and creating a new PlayingCard object with the given values.
     */
    public DeckOfCards(){
        this.cardDeck = new ArrayList<>();
        for (char suit : suits) {
            for (int face = 1; face <= 13; face++) {
                cardDeck.add(new PlayingCard(suit, face, "PNG-cards-1.3/" + suit + face + ".png"));
            }
        }
    }

    /**
     * This method deals a hand of specified number of cards from the deck by selecting random cards from the deck.
     * The dealt cards are removed from the deck.
     *
     * @param amountOfCards the number of cards to deal
     * @return an ArrayList of PlayingCard objects representing the hand of dealt cards
     */
    public ArrayList<PlayingCard> dealHand(int amountOfCards){
        ArrayList<PlayingCard> handOfCards = new ArrayList<>();
        for (int i = 0; i < amountOfCards; i++){
            randomNum = (int)(Math.random() * cardDeck.size());
            handOfCards.add(cardDeck.get(randomNum));
            cardDeck.remove(randomNum);
        }
        return handOfCards;
    }

    /**
     * This method returns a List of all the PlayingCard objects in the deck.
     *
     * @return a List of PlayingCard objects representing all the cards in the deck
     */
    public List<PlayingCard> getAllCards(){
        return cardDeck;
    }
}

