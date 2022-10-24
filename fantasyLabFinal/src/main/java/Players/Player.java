package Players;


public abstract class Player {
    private String name;
    public int noOfHealthPoints;
    private int noOfGoldCoins;

    public Player(String name, int noOfHealthPoints, int noOfGoldCoins) {
        this.name = name;
        this.noOfHealthPoints = noOfHealthPoints;
        this.noOfGoldCoins = noOfGoldCoins;


    }

    public int getNoOfHealthPoints() {
        return noOfHealthPoints;
    }

    public int takeDamage(int damage) {
        return this.noOfHealthPoints -= damage;
    }

    public int giveHeal(int heal) {
        return this.noOfHealthPoints += heal;
    }

    public int giveLoot(int loot) {
        return this.noOfGoldCoins += loot;
    }

    public int getNoOfGoldCoins() {
        return noOfGoldCoins;
    }

}

