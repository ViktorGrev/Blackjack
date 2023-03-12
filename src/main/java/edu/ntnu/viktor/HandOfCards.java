package edu.ntnu.viktor;

import java.util.ArrayList;

/**
 * The HandOfCards class represents a hand of playing cards.
 * It contains methods for counting the total face value of the
 * cards in the hand and retrieving the list of cards in the hand.
 * Each card in the hand is represented by a PlayingCard object.
 */
public class HandOfCards {

    private ArrayList<PlayingCard> hand;  // an ArrayList of PlayingCard objects representing the cards in the hand

    /**
     * This constructor initializes a new HandOfCards object with
     * the given ArrayList of PlayingCard objects representing the
     * cards in the hand.
*    *
     * @param hand an ArrayList of PlayingCard objects representing
     * the cards in the hand
     */
    public HandOfCards(ArrayList<PlayingCard> hand){
        this.hand = hand;
    }

    /**
     * This method calculates the total face value of the cards in
     * the hand.
     *
     * @return an integer representing the total face value of the
     * cards in the hand
     */
    public int sumOfTheFaces(){
        return hand.stream() //convert the ArrayList to Stream
                .mapToInt(PlayingCard::getFace) // map each card to its face value and convert it to an IntStream
                .sum(); // return the sum of all the face values in the IntStream
    }

    /**
     * This method returns the ArrayList of PlayingCard objects
     * representing the cards in the hand.
     *
     * @return an ArrayList of PlayingCard objects representing
     * the cards in the hand.
     */
    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
}