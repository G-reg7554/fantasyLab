package Weapons;

import Interface.IWeapon;

public class Club implements IWeapon {
    private int damage;

    public Club(int damage) {
        this.damage = damage;
    }
    public int attack(int bludgeon){
        return this.damage + bludgeon;
    }
}
