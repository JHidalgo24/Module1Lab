package edu.wctc;

public class Player {
    private final PlayerHand hand;
    private final String name;

    public Player(String name){
        hand = new PlayerHand();
        this.name = name;
    }

    public void showPlayerCards() {
        hand.getCards().forEach(card -> System.out.println(card.toString()));
    }
}
