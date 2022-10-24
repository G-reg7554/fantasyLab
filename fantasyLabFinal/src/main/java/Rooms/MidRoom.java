package Rooms;

import Enemies.Enemy;
import Interface.ILoot;
import Interface.IRoom;

public class MidRoom extends Room implements IRoom {
    public MidRoom(String name, Enemy enemy, ILoot loot) {
        super(name, enemy, loot);
    }

    public String room(){
        return "Make all Mid Room of the same type";
    }
}
