package Players;

import Interface.IArmour;
import Interface.ILoot;
import Interface.IWeapon;

public class Dwarf extends Fighter{
    public Dwarf(String name, int noOfHealthPoints, int noOfGoldCoins, IWeapon weapon) {
        super(name, noOfHealthPoints, noOfGoldCoins, weapon);
    }
}
