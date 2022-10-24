package Weapons;

import Interface.IWeapon;

public class Axe implements IWeapon {

    private int damage;

    public Axe(int damage) {
        this.damage = damage;
    }

    public int attack(int chop) {
        return this.damage + chop;
    }
}


