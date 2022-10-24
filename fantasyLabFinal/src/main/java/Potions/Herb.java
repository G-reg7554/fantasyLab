package Potions;

import Interface.IHeal;

public class Herb implements IHeal {

    private int health;

    public Herb(int health) {
        this.health = health;
    }

    public int heal(int boost){
        return this.health + boost;
    }

}
