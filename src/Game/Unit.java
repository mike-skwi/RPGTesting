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
    // 0 = beginner, 1 = mage, 2 = warrior, 3 = thief, 4 = priest //
    byte job = 2;
    String jobTitle;



    //TODO remove or update once you do the weapon class

    int attack;
    int defense;

    //TODO make damage calculation
    //TODO implement stats in some way


    //TODO find out where these interface methods are supposed to go

    public abstract void gainHp();

    public abstract void gainMana();
    public abstract void loseHp();

    public abstract void loseMana();

    public abstract void die();

    public void display(){
        System.out.println("Name: " + this.name + "\nLevel: " + this.level);
        System.out.println("HP: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("MP: " + this.currentMana + "/" + this.maxMana);
    }

    //TODO take out a lot of the code from both hero and enemy
    // Have them both extend this class





}
