package Game;

//TODO implement take damage once common hero/enemy code has been moved here
public abstract class Unit implements TakesDamage{
    // This is the class for all living things, hero and enemy
    int currentHealth;
    int currentMana;
    int maxHealth;
    int maxMana;

    boolean alive = true;

    int level = 1;
    String name;
    String job;
    String jobTitle;



    //TODO remove or update once you do the weapon class

    int attack;
    int defense;

    //TODO make damage calculation
    //TODO implement stats in some way


    //TODO find out where these interface methods are supposed to go

    public void display(){
        System.out.println("Name: " + this.name + "\nLevel: " + this.level);
        System.out.println("Class: " + this.job);
        System.out.println("HP: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("MP: " + this.currentMana + "/" + this.maxMana);
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





}
