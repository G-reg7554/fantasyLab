package Enemies;

import Interface.IWeapon;

public abstract class Enemy {
    IWeapon weapon;
    private String name;
    private int noOfHealthPoints;

    public Enemy(String name, int noOfHealthPoints, IWeapon weapon) {
        this.name = name;
        this.noOfHealthPoints = noOfHealthPoints;
        this.weapon = weapon;
    }

    public int getNoOfHealthPoints() {
        return noOfHealthPoints;
    }


    public IWeapon getWeapon(IWeapon weapons) {
        return weapon;
    }

    public int takeDamage(int damage){
        return this.noOfHealthPoints -= damage;
    }

}


