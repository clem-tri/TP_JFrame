package game;

public class EnergyCard extends Card {

    public EnergyCard(){
        this.setType("ENERGY");
    }

    public String toString(){
        return "Energy card: "+this.getName();
    }


}
