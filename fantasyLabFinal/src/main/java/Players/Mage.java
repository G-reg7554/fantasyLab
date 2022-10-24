package Players;

import Interface.IDefend;
import Interface.ILoot;
import Interface.ISpell;
import Interface.IWeapon;


public abstract class Mage extends Player  {
    private ISpell spell;
    private IDefend defend;

    public Mage(String name, int noOfHealthPoints, int noOfGoldCoins, ISpell spell, IDefend defend) {
        super(name, noOfHealthPoints, noOfGoldCoins);
        this.spell = spell;
        this.defend = defend;
    }

    public ISpell getSpells(ISpell spells) {
        return spell;
    }

    public IDefend getDefence(IDefend defense) {
        return defend;
    }

}
