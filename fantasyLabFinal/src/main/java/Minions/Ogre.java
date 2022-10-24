package Minions;

import Interface.IDefend;

public class Ogre implements IDefend {

    private int attackEnemy;

    public Ogre(int attackEnemy) {
        this.attackEnemy = attackEnemy;
    }

    public int defend(int defence){
        return this.attackEnemy + defence;
    }
}
