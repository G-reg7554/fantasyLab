package Potions;

import Interface.IHeal;

public class Potion implements IHeal {
    private int health;

    public Potion(int health) {
        this.health = health;
    }

    public int heal(int boost){
        return this.health + boost;
    }


}
