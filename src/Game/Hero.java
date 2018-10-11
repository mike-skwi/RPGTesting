package Game;
import java.util.Map;

public abstract class Hero extends Unit{

    // Each weapon in the game is a different number
    //TODO use another map to link the item number --> item name
    // Example: 123, Steel Halberd


    String[] inventory = new String[5];


    //TODO figure out how to make a nice inventory system
    //Most likely with keys and values

    // Example: Head , Bronze Helmet, Weapon , Iron Lance. Etc.


    //  Map<String, String> equipped = new Map<String, String>();
    //  equipped.put("testing","testing");


    int exp = 0;
    int expUntilNextLevel = 20;


    //TODO remove these once you implement weapon class
    // These are just for testing purposes


    //TODO add the parameters for hero
    public Hero(String name){
        this.name = name;
        if (job == 0)
        {
            this.job = 0;
            this.jobTitle = "Beginner";
            this.maxHealth = 100;
            this.maxMana = 20;

        }
        else if (job == 1)
        {
            this.job = 1;
            this.jobTitle = "Magician";
            this.maxHealth = 80;
            this.maxMana = 120;

        }
        else if (job == 2)
        {
            this.job = 2;
            this.jobTitle = "Fighter";
            this.maxHealth = 150;
            this.maxMana = 30;

        }
        else if (job == 3)
        {
            this.job = 0;
            this.jobTitle = "Rogue";
            this.maxHealth = 70;
            this.maxMana = 50;

        }
        else if (job == 4)
        {
            this.job = 0;
            this.jobTitle = "Cleric";
            this.maxHealth = 80;
            this.maxMana = 100;

        }
        else
        {
            System.out.println("Invalid class option");
        }
    }
    public Hero(){
        this.name = "Mistake :^) ";
    }


    public void advanceDisplay(){
        //TODO write a method that shows all the stats, not just the HP/MP
    }


    //TODO maybe make this it's own file?
    public void levelUp(){
        this.level++;
        System.out.println("Ding!\nYou're now level " + this.level);
        this.expUntilNextLevel = this.expUntilNextLevel + ((this.expUntilNextLevel * 2)/this.level + 7);
        System.out.println("The exp needed to level is " + this.expUntilNextLevel);

        //TODO Use the strategy pattern to level based on class choice

    }

}
