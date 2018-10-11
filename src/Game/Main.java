
package Game;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        //TODO Make a scanner or something so that user can input character options

        Hero newCharacter = new Hero("Mowshe");
        newCharacter.display();

        Enemy newEnemy = new Enemy(2,"Cleric","thing");


        // Enemies in succession will be an array of all the enemies the player has to fight in a row
        Enemy[] firstBattle = new Enemy[3];
        firstBattle[0] = new Enemy(2,"Fighter", "Gobo");
        firstBattle[1] = new Enemy(2,"Magician","Gobo");
        firstBattle[2] = new Enemy(2,"Thief","Gobo");


        Battle.fight(newCharacter,newEnemy);


    }
}
