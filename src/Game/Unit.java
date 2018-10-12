package Game;
import java.util.Dictionary;

//TODO implement take damage once common hero/enemy code has been moved here
public abstract class Unit implements TakesDamage{
    // This is the class for all living things, hero and enemy
    public int currentHealth;
    public  int currentMana;
    public  int maxHealth;
    public  int maxMana;

    boolean alive = true;

    protected int level;
    protected String name;
    protected String job;
    protected String jobTitle;


    // Body parts: :
    // Ideally, certain moves damage limbs of either user, enemy, or both
    // ie: You can throw you back out if you swing improperly
    // Fighters will be able to choose what part of the body they want to attack
    // Or they can just do a more powerful swing not really aiming for anything in particular

    protected int rightArmIntegrity = 100, leftArmIntegrity = 100;
    protected int rightLegIntegrity = 100, leftLegIntegrity = 100;
    protected int neckIntegrity = 100;
    protected int backIntegrity = 100;
    protected int shoulderIntegrity = 100;

    // Status Ailments: :
    // At the beginning of the turn, there will be a check to see what type of ailments the user has
    boolean poisoned = false;
    boolean paralyzed = false;
    boolean feared = false;
    boolean bleeding = false;
    boolean onFire = false;


    // Elemental Weaknesses: :
    // tbh I dont even want to start doing this now.
    // pretty self explanatory though



    // Equipped weapons/items
    public String leftHand;
    public String rightHand;

    // Attack and Defense Stats
    //TODO remove or update once you do the weapon class
    //TODO add different types of attacks. For now, they can just be basic
    public int attack;
    public int defense;

    //TODO make damage calculation
    //TODO implement stats in some way


    //TODO find out where these interface methods are supposed to go

    public void display(){
        System.out.println("Name: " + this.name + "\nLevel: " + this.level);
        System.out.println("Class: " + this.job);
        System.out.println("HP: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("MP: " + this.currentMana + "/" + this.maxMana);
    }

    public void displayName(){
        System.out.println("Name: " + this.name + " Level: " + this.level + " Job: " + this.job );
    }

    @Override
    public void gainHp() {

    }
    @Override
    public void gainMana(){

    }
    @Override
    public void loseHp(){

    }
    @Override
    public void loseMana() {

    }

    //TODO take out a lot of the code from both hero and enemy
    // Have them both extend this class


    ////////////////////////////////
    //TODO battle methods ?

    public void block(){

    }
    public void attack(){

    }
    public void castSpell(String spell){

    }

    //May change the data type of this from item to something else
    //Can be used in either battle or non battle
    public void useItem(String item){

    }
    ////////////////////////////////
    //TODO outside of battle methods

    public void equip(String item){

    }


}
