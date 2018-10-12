package Game.Enemies;

import Game.Enemy;

public class Goblin extends Enemy {

    public Goblin(){
        this.level = 3;
        this.maxHealth = 120;
        this.currentHealth = 120;

        this.leftHand = null;
        this.rightHand = "Wooden Club";

        this.attack = 30;
        this.defense = 20;


    }

}
