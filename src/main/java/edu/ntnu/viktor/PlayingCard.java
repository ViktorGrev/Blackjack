package edu.ntnu.viktor;

import java.util.Objects;


/**
 * Represents a playing card. A playing card has a number (face) between
 * 1 and 13, where 1 is called an Ace, 11 = Knight, 12 = Queen and 13 = King.
 * The card can also be one of 4 suits: Spade, Heart, Diamonds and Clubs.
 */
public class PlayingCard {

    private final char suit; // 'S'=spade, 'H'=heart, 'D'=diamonds, 'C'=clubs
    private final int face; // a number between 1 and 13
    private final String image;

    /**
     * Creates an instance of a PlayingCard with a given suit and face.
     *
     * @param suit The suit of the card, as a single character. 'S' for Spades,
     *             'H' for Heart, 'D' for Diamonds and 'C' for clubs
     * @param face The face value of the card, an integer between 1 and 13
     */
    public PlayingCard(char suit, int face, String image) {
        this.suit = suit;
        this.face = face;
        this.image = image;
    }

    /**
     * Returns the suit and face of the card as a string.
     * A 4 of hearts is returned as the string "H4".
     *
     * @return the suit and face of the card as a string
     */
    public String getAsString() {
        return String.format("%s%s", suit, face);
    }

    /**
     * Returns the suit of the card, 'S' for Spades, 'H' for Heart, 'D' for Diamonds and 'C' for Clubs
     *
     * @return the suit of the card
     */
    public char getSuit() {
        return suit;
    }

    /**
     * Returns the face of the card (value between 1 and 13).
     *
     * @return the face of the card
     */
    public int getFace() {
        return face;
    }

    /**
     * Returns the image of the card (as an url to the image in the resources' folder).
     *
     * @return the face of the card
     */
    public String getImage() {
        return image;
    }

    /**
     * This method overrides the equals method to check if two playing cards are
     * equal based on their suit and face value.
     *
     * @param o the object to be compared
     * @return true if the object is equal to this PlayingCard object, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return suit == that.suit && face == that.face;
    }

    /**
     This method overrides the hashCode method to generate a unique hashcode
     for each PlayingCard object based on its suit and face value.
     @return the hashcode for this PlayingCard object
     */
    @Override
    public int hashCode() {
        return Objects.hash(suit, face);
    }
}

