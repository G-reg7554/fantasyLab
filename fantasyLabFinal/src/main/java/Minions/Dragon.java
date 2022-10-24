package Minions;

import Interface.IDefend;

public class Dragon implements IDefend {

    private int attackEnemy;

    public Dragon(int attackEnemy) {
        this.attackEnemy = attackEnemy;
    }

    public int defend(int defence){
        return this.attackEnemy + defence;
    }
}
