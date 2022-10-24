package Players;

import Interface.IArmour;
import Interface.IHeal;
import Interface.ILoot;
import Interface.IWeapon;
import Weapons.Sword;


public abstract class Fighter extends Player {
    private IWeapon weapon;
    private int armour;
    Player player;


    public Fighter(String name, int noOfHealthPoints, int noOfGoldCoins, IWeapon weapon) {
        super(name, noOfHealthPoints, noOfGoldCoins);
        this.weapon = weapon;

    }

    public int giveArmour(int armour) {

        return noOfHealthPoints += armour;
    }


    public IWeapon getWeapon(IWeapon weapons) {
        return weapon;
    }
}






