package Game;

public class Enemy extends Unit{

    String droppedOnDeath;

    //TODO add equipped items

    //TODO balance this by potentially adding more parameters
    // Race? Etc
    public Enemy(String name, String job, int level){


    }

    public Enemy(){

    }



    // Not sure if I'm supposed to add these here.
    // I feel like they SHOULD be in the unit super class but they weren't working when I put them there

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
        // if last in array of enemies, state this
        // else, move onto next enemy to fight
}
