package Game;
import java.util.Map;

public class Hero extends Unit{

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

    //TODO remove 'job title' since class is a string now
    //TODO add the parameters for hero
    public Hero(String name, String job){
        this.name = name;
        //These job strings DO NOT ignore CasE
        if (job == "Beginner")
        {
            this.job = "Beginner";
            this.jobTitle = "Beginner";
            this.maxHealth = 100;
            this.maxMana = 20;

        }
        else if (job == "Magician")
        {
            this.job = "Magician";
            this.jobTitle = "Magician";
            this.maxHealth = 80;
            this.maxMana = 120;

        }
        else if (job == "Fighter")
        {
            this.job = "Fighter";
            this.jobTitle = "Fighter";
            this.maxHealth = 150;
            this.maxMana = 30;

        }
        else if (job == "Rogue")
        {
            this.job = "Rogue";
            this.jobTitle = "Rogue";
            this.maxHealth = 70;
            this.maxMana = 50;

        }
        else if (job == "Cleric")
        {
            this.job = "Cleric";
            this.jobTitle = "Cleric";
            this.maxHealth = 80;
            this.maxMana = 100;

        }
        else
        {
            System.out.println("Invalid class option");
        }
        this.currentHealth = this.maxHealth;
        this.currentMana = this.maxMana;
        this.level = 1;
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

    //TODO find out why I have to write a seperate one of these TakesDamage methods in
    // hero and another version in enemy

    public void gainHp(int gainedHp){
        this.currentHealth = this.currentMana + gainedHp;
        if (this.currentHealth > this.maxHealth){
            this.currentHealth = this.maxHealth;
        }
        System.out.println(this.name + " gained " + gainedHp + " health");
        System.out.println("Your HP is now: " + this.currentHealth);
    }

    public void gainMana(int gainedMana) {
        this.currentMana = this.currentMana + gainedMana;
        if (this.currentMana > this.maxMana){
            this.currentMana = this.maxMana;
        }
        System.out.println(this.name + " gained " + gainedMana + " mana");
        System.out.println("Your mana is now: " + this.currentMana);
    }

    public void loseHp(int lostHealth){
        this.currentHealth = this.currentHealth - lostHealth;
        if (this.currentHealth <= 0 ){
            die();
        }
        System.out.println(this.name + " took " + lostHealth + " damage");
        System.out.println("Your hp is now: " + this.currentHealth);
    }

    public void loseMana(int lostMana){
        this.currentMana = this.currentMana - lostMana;
        if (lostMana > this.currentMana){
            this.currentMana = 0;
        }
        System.out.println(this.name + " used " + lostMana + " mana");
        System.out.println("Your mana is now: " + this.currentMana);
    }


    public void die(){
        System.out.println("AHH");
    }


}
