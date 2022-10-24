package Enemies;

import Interface.IWeapon;

public class VendingMachine extends Enemy{
    public VendingMachine(String name, int noOfHealthPoints, IWeapon weapon) {
        super(name, noOfHealthPoints, weapon);
    }
}
