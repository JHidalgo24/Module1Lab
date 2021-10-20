package edu.wctc;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Card {
    private String Face;
    private String Suit;
    private String[] facesList = new String[]{"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};//faces
    private String[] suitsList = new String[]{"Clubs","Diamonds","Spades","Hearts"};//suits

    public Card(){
        Face = facesList[(int)Math.floor(Math.random()*(facesList.length))];//assigns random face
        Suit = suitsList[(int)Math.floor(Math.random()*(suitsList.length))];//assigns random suit
    }

    //makes card to string to be easily outputted
    @Override
    public String toString() {
        return Face + " of " + Suit;
    }
}
