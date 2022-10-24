package Weapons;

import Interface.IWeapon;

public class Sword implements IWeapon {
    private int damage;

    public Sword(int damage) {
        this.damage = damage;
    }

    public int attack(int slice) {
        return this.damage + slice;
    }
}
