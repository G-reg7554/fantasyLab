package Spells;

import Interface.IDefend;
import Interface.ISpell;

public class EarthQuake implements ISpell {
    private int damage;

    public EarthQuake(int damage) {
        this.damage = damage;
    }

    public int cast(int spellDamage){
        return this.damage + spellDamage;
    }
}
