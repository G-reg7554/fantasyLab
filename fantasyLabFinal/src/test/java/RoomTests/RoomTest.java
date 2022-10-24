package RoomTests;

import Armour.SteelArmour;
import Enemies.Orc;
import Enemies.Troll;
import Enemies.VendingMachine;
import Interface.ILoot;
import Loot.GoldChest;
import Minions.Dragon;
import Minions.Ogre;
import Players.*;
import Potions.Herb;
import Potions.Potion;
import Rooms.EntranceRoom;
import Rooms.FinalRoom;
import Rooms.MidRoom;
import Rooms.Room;
import Spells.ArcaneWave;
import Spells.EarthQuake;
import Spells.Fireball;
import Weapons.Axe;
import Weapons.Club;
import Weapons.CocaCola;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;
    Cleric cleric;
    Orc orc;
    Troll troll;
    Axe axe;
    Club club;
    Sword sword;
    CocaCola cocaCola;
    VendingMachine vendingMachine;
    Warlock warlock;
    Fireball fireball;
    Wizard wizard;
    EarthQuake earthQuake;
    Potion potion;
    Herb herb;
    Dragon dragon;
    Ogre ogre;

    ILoot loot;
    ArcaneWave arcaneWave;
    GoldChest goldChest;

    EntranceRoom entranceRoom;
    MidRoom midRoom;
    FinalRoom finalRoom;
    SteelArmour steelArmour;
    Room room;

    @Before
    public void setUP(){
        goldChest =new GoldChest(0);
        entranceRoom = new EntranceRoom("Entrance Room", troll, goldChest);
        midRoom = new MidRoom("Mid Room", orc, goldChest);
        finalRoom = new FinalRoom("Final Room", vendingMachine, goldChest);
        dragon = new Dragon(0);
        ogre = new Ogre(0);
        potion = new Potion(0);
        fireball = new Fireball(0);
        arcaneWave = new ArcaneWave(0);
        earthQuake = new EarthQuake(0);
        club = new Club(0);
        sword = new Sword(0);
        cocaCola = new CocaCola(0);
        barbarian = new Barbarian("Bjorgan",100,0, sword);
        dwarf = new Dwarf("Jim",120,0, sword);
        orc = new Orc("flem", 50,sword);
        troll = new Troll("bridge", 50,sword);
        vendingMachine = new VendingMachine("HandBiter",1000, cocaCola);
        knight = new Knight("Sir Dance Alot",150,0, axe);
        warlock = new Warlock("Hogfarts",200,0, fireball, ogre);
        wizard = new Wizard("Beardy",200,0,arcaneWave, dragon);
        cleric = new Cleric("Herby Harry",88,0, potion);
        steelArmour = new SteelArmour(0);








    }

    @Test
    public void orcAttacksDwarfTest(){
        // takes orcs health points from 50 to 25
        orc.takeDamage(dwarf.getWeapon(sword).attack(25));
        assertEquals(25, orc.getNoOfHealthPoints());
    }

    @Test
    public void knightVsTrollTest(){
        knight.takeDamage(midRoom.getEnemy(troll.getWeapon(axe).attack(25)));
        midRoom.getEnemy(troll.takeDamage(orc.getWeapon(axe).attack(15)));
        entranceRoom.getLoot(goldChest).loot(25);
        assertEquals(125, knight.getNoOfHealthPoints());
        assertEquals(35, troll.getNoOfHealthPoints());

    }

    @Test
    public void vendingMachineMassiveAttackTest(){
        knight.takeDamage(entranceRoom.getEnemy(vendingMachine.getWeapon(cocaCola).attack(1000)));
        assertEquals(-850, knight.getNoOfHealthPoints());
    }

    @Test
    public void warlockSpellFire(){
        knight.takeDamage(warlock.getSpells(fireball).cast(1));
        assertEquals(149, knight.getNoOfHealthPoints(),0);
    }

    @Test
    public void warlockEarthQuakeTest(){
        knight.takeDamage(warlock.getSpells(earthQuake).cast(1));
        assertEquals(149, knight.getNoOfHealthPoints(),0);
    }

    @Test
    public void warlockArcaneTest(){
        knight.takeDamage(wizard.getSpells(arcaneWave).cast(1));
        assertEquals(149, knight.getNoOfHealthPoints(),0);
    }

    @Test
    public void warlockMinions(){
        knight.takeDamage(wizard.getDefence(ogre).defend(1));
        knight.takeDamage(wizard.getDefence(dragon).defend(1));
        assertEquals(148, knight.getNoOfHealthPoints());
    }

    @Test
    public void clericHealTest(){
    dwarf.giveHeal(cleric.getHeal(herb).heal(50));
        dwarf.giveArmour(steelArmour.armour(50));
    assertEquals(220, dwarf.getNoOfHealthPoints());

    }

    @Test public void getLootTest(){
        knight.giveLoot(finalRoom.getLoot(goldChest).loot(100));
        assertEquals(100, knight.getNoOfGoldCoins());
    }

    @Test public void getRoomSize(){
       entranceRoom.addRoomsToDungeon(entranceRoom);
       entranceRoom.addRoomsToDungeon(midRoom);
        entranceRoom.addRoomsToDungeon(finalRoom);

        assertEquals( 3, entranceRoom.getDungeonSize());
    }






}
