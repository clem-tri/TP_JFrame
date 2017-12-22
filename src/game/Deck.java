package game;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    private String name;

    public Deck(String name){
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String toString(){
        return this.name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void add_card(Card card){
        this.cards.add(card);
    }

    public void remove_card(Card card){
        this.cards.remove(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
