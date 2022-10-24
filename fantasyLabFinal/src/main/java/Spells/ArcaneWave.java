package Spells;

import Interface.ISpell;

public class ArcaneWave implements ISpell {
    private int damage;

    public ArcaneWave(int damage) {
        this.damage = damage;
    }

    public int cast(int spellDamage){
        return this.damage + spellDamage;
    }
}
