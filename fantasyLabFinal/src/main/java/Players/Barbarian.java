package Players;

import Interface.IArmour;
import Interface.ILoot;
import Interface.IWeapon;

public class Barbarian extends Fighter{
    public Barbarian(String name, int noOfHealthPoints, int noOfGoldCoins, IWeapon weapon) {
        super(name, noOfHealthPoints, noOfGoldCoins, weapon);
    }
}
