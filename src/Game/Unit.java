package Game;

//TODO implement take damage once common hero/enemy code has been moved here
public abstract class Unit implements TakesDamage{
    // This is the class for all living things, hero and enemy
    int maxHealth;
    int maxMana;
    int level = 1;
    String name;
    // 0 = beginner, 1 = mage, 2 = warrior, 3 = thief, 4 = priest //
    byte job = 2;
    String jobTitle;

    int currentHealth;
    int currentMana;


    //TODO remove or update once you do the weapon class

    int attack;
    int defense;

    //TODO make damage calculation
    //TODO implement stats in some way


    //TODO find out where these interface methods are supposed to go

    public void gainHp(int gainedHp){
        this.currentHealth = this.currentHealth + gainedHp;
        if (this.currentHealth > this.maxHealth){
            this.currentHealth = this.maxHealth;
        }
        System.out.println("Your hp is now: " + this.currentHealth);
    }

    public void gainMana(int gainedMana){
        this.currentMana = this.currentMana + gainedMana;
        if (this.currentMana > this.maxMana){
            this.currentMana = this.maxMana;
        }
        System.out.println("Your mana is now: " + this.currentMana);
    }

    public void loseHp(){

    }

    public void loseMana(){

    }

    public void die(){

    }

    public void display(){
        System.out.println("Name: " + this.name + "\nLevel: " + this.level);
        System.out.println("HP: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("MP: " + this.currentMana + "/" + this.maxMana);
    }

    //TODO take out a lot of the code from both hero and enemy
    // Have them both extend this class





}
