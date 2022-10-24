package Weapons;

import Interface.IWeapon;

public class CocaCola implements IWeapon {
    private int damage;

    public CocaCola(int damage) {
        this.damage = damage;
    }

    public int attack(int slice) {
        return this.damage + slice;
    }
}
