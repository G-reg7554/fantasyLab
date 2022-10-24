package Rooms;

import Enemies.Enemy;
import Interface.ILoot;
import Interface.IRoom;
import Interface.IWeapon;

import java.util.ArrayList;

public class EntranceRoom extends Room implements IRoom {
    private ArrayList<IRoom> dungeon;
    private ILoot loot;
    public EntranceRoom(String name, Enemy enemy, ILoot loot) {
        super(name, enemy, loot);
        this.dungeon = new ArrayList<>();
    }

    public String room(){
        return "Make all Entrance Room of the same type";
    }
    public void addRoomsToDungeon(IRoom room){
        dungeon.add(room);
    }
    public int getDungeonSize() {
        return dungeon.size();
    }
}
