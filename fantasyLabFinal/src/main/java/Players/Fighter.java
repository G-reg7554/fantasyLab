package Players;


import Interface.IWeapon;



public abstract class Fighter extends Player {
    private IWeapon weapon;




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






