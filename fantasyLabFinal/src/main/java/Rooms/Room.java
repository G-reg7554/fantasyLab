package Rooms;

import Enemies.Enemy;
import Interface.ILoot;
import Interface.IRoom;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    private Enemy enemy;
    private ILoot loot;



    public Room(String name, Enemy enemy, ILoot loot) {
        this.name = name;
        this.enemy = enemy;
        this.loot = loot;
    }


    public int getEnemy(int enemy) {
        return enemy;
    }

    public ILoot getLoot(ILoot looted) {
        return this.loot;
    }
}
