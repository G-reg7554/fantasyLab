package Players;

import Interface.IArmour;
import Interface.ILoot;
import Interface.IWeapon;

public class Knight extends Fighter{
    public Knight(String name, int noOfHealthPoints, int noOfGoldCoins, IWeapon weapon) {
        super(name, noOfHealthPoints, noOfGoldCoins, weapon);
    }
}
