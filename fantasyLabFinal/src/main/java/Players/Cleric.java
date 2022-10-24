package Players;

import Interface.IHeal;


public class Cleric extends Healer {

    public Cleric(String name, int noOfHealthPoints, int noOfGoldCoins, IHeal heal) {
        super(name, noOfHealthPoints, noOfGoldCoins, heal);
    }
}
