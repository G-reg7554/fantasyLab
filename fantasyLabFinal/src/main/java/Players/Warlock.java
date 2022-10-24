package Players;

import Interface.IDefend;
import Interface.ILoot;
import Interface.ISpell;

public class Warlock extends Mage{

    public Warlock(String name, int noOfHealthPoints, int noOfGoldCoins, ISpell spell, IDefend defend) {
        super(name, noOfHealthPoints, noOfGoldCoins, spell, defend);
    }
}
