package game;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Deck> decks;

    public Player() {
        this.name = "Player #1";
        this.decks=new ArrayList<Deck>();
    }

    public Player( String name ) {

        this.name = name;
        this.decks=new ArrayList<Deck>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Deck> decks) {
        this.decks = decks;
    }

    public void add_deck(Deck deck){
        this.decks.add(deck);
    }

    public void remove_deck(Deck deck){
        this.decks.remove(deck);
    }
}
