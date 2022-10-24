package Spells;

import Interface.ISpell;

public class Fireball implements ISpell {
    private int damage;

    public Fireball(int damage) {
        this.damage = damage;
    }

    public int cast(int spellDamage){
        return this.damage + spellDamage;
    }
}



