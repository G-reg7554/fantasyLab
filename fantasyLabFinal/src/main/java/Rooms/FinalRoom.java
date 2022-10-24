package Rooms;

import Enemies.Enemy;
import Interface.ILoot;
import Interface.IRoom;

public class FinalRoom extends Room implements IRoom {
    public FinalRoom(String name, Enemy enemy, ILoot loot) {
        super(name, enemy, loot);
    }

    public String room(){
        return "Make all Final Room of the same type";
    }
}
