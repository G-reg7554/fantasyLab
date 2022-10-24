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

public class EntranceRoomTest {
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
    public void setUP() {
        goldChest = new GoldChest(0);
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
        barbarian = new Barbarian("Bjorgan", 100, 0, sword);
        dwarf = new Dwarf("Jim", 120, 0, sword);
        orc = new Orc("flem", 50, sword);
        troll = new Troll("bridge", 50, sword);
        vendingMachine = new VendingMachine("HandBiter", 200, cocaCola);
        knight = new Knight("Sir Dance Alot", 150, 0, axe);
        warlock = new Warlock("Hogfarts", 200, 0, fireball, ogre);
        wizard = new Wizard("Beardy", 200, 0, arcaneWave, dragon);
        cleric = new Cleric("Herby Harry", 88, 0, potion);
        steelArmour = new SteelArmour(0);
    }
    @Test
    public void checkEntranceRoomSize(){
        entranceRoom.addRoomsToDungeon(entranceRoom);
        entranceRoom.addRoomsToDungeon(midRoom);
        entranceRoom.addRoomsToDungeon(finalRoom);
        assertEquals(3, entranceRoom.getDungeonSize());
    }
    @Test
    public void clearFirstWaveTest(){

        knight.takeDamage(entranceRoom.getEnemy(troll.getWeapon(axe).attack(25)));
        knight.giveHeal(cleric.getHeal(herb).heal(10));
        knight.giveArmour(5);

        troll.takeDamage(barbarian.getWeapon(axe).attack(50));
        assertEquals(140, knight.getNoOfHealthPoints());
        assertEquals(0, troll.getNoOfHealthPoints());
    }

    @Test
    public void clearSecondWave(){
        entranceRoom.getEnemy(orc.takeDamage(warlock.getDefence(dragon).defend(15)));
        entranceRoom.getEnemy(orc.takeDamage(wizard.getSpells(fireball).cast(20)));
        wizard.takeDamage(entranceRoom.getEnemy(orc.getWeapon(cocaCola).attack(50)));
        wizard.giveHeal(cleric.getHeal(potion).heal(15));
        entranceRoom.getEnemy(orc.takeDamage(warlock.getSpells(arcaneWave).cast(15)));
        assertEquals(0, orc.getNoOfHealthPoints());
        assertEquals(165, wizard.getNoOfHealthPoints());
    }

    @Test
    public void clearingRoomTest(){

        entranceRoom.getEnemy(vendingMachine.takeDamage(wizard.getDefence(ogre).defend(90)));
        barbarian.takeDamage(entranceRoom.getEnemy(vendingMachine.getWeapon(cocaCola).attack(50)));
        entranceRoom.getEnemy(vendingMachine.takeDamage(dwarf.getWeapon(club).attack(60)));
        knight.takeDamage(entranceRoom.getEnemy(vendingMachine.getWeapon(axe).attack(50)));
        entranceRoom.getEnemy(vendingMachine.takeDamage(wizard.getSpells(earthQuake).cast(50)));

        assertEquals(50, barbarian.getNoOfHealthPoints());
        assertEquals(100, knight.getNoOfHealthPoints());
        assertEquals(0,vendingMachine.getNoOfHealthPoints());
    }

    @Test
    public void gettingLootKnight(){
        knight.giveLoot(entranceRoom.getLoot(goldChest).loot(200));
        assertEquals(200, knight.getNoOfGoldCoins());
    }

    @Test
    public void gettingLootWizard(){
        wizard.giveLoot(entranceRoom.getLoot(goldChest).loot(50));
        assertEquals(50, wizard.getNoOfGoldCoins());
    }

    @Test
    public void gettingLootDwarf(){
        dwarf.giveLoot(entranceRoom.getLoot(goldChest).loot(90));
        assertEquals(90, dwarf.getNoOfGoldCoins());
    }

    @Test
    public void gettingLootBarbarian(){
        barbarian.giveLoot(entranceRoom.getLoot(goldChest).loot(150));
        assertEquals(150, barbarian.getNoOfGoldCoins());
    }
}
