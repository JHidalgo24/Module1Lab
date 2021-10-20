package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayerHand {

    //Player's cards
    private List<Card> cards = new ArrayList<>();

    PlayerHand(){
        //assigns the player 5 random cards
        for (int i = 0; i < 5; i++) {
            cards.add(new Card());
        }
    }

    //returns list to player to show cards
    public List<Card> getCards() {
        return cards;
    }
}
