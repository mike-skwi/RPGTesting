
package Game;
import Game.Enemies.Goblin;

import java.util.Map;

import static Game.Battle.fight;


public class Main {

    public static void main(String[] args) {

        //TODO Make a scanner or something so that user can input character options

        Hero newCharacter = new Hero("Mowshe", "Rogue");

     //   Enemy newEnemy = new Enemy("Testus", "Rogue", 4);

        //TODO this is where I'm stuckkkkkkkkkkk
        Enemy newBoye = new Enemy(new Goblin());



        // Enemies in succession will be an array of all the enemies the player has to fight in a row
        Enemy[] firstBattle = new Enemy[3];
        firstBattle[0] = new Enemy("Testus", "Rogue", 4);
        firstBattle[1] = new Enemy("Testus", "Rogue", 4);
        firstBattle[2] = new Enemy("Testus", "Rogue", 4);

        //Battle is broken rn due to enemy being broken
        //Battle.fight(newCharacter,newEnemy);
//
//        newCharacter.display();
//        newCharacter.loseHp(50);
//        newCharacter.gainHp(999);
//        newCharacter.loseMana(9000);
//        newCharacter.gainMana(9000);

        fight(newCharacter, newBoye);

    }
}
