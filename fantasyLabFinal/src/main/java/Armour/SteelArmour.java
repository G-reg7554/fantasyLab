package Armour;

import Interface.IArmour;

public class SteelArmour implements IArmour {
    private int protection;

    public SteelArmour(int protection) {
        this.protection = protection;
    }

    public int armour(int protect){
        return this.protection + protect;
    }
}
