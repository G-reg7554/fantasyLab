package Loot;

import Interface.ILoot;

public class GoldChest implements ILoot {


    private int loot;
    public GoldChest(int loot) {
        this.loot = loot;
    }

    public int loot(int chestLoot) {
        return this.loot + chestLoot;
    }

}
