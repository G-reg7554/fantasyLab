package Players;

import Interface.IHeal;
import Interface.ILoot;
import Interface.IWeapon;

public abstract class Healer extends Player {
    private IHeal heal;

    public Healer(String name, int noOfHealthPoints, int noOfGoldCoins, IHeal heal) {
        super(name, noOfHealthPoints, noOfGoldCoins);
        this.heal = heal;
    }

    public IHeal getHeal (IHeal heals) {
        return heal;
    }
}
