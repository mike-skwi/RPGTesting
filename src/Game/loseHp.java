package Game;

public class loseHp extends Hero{
    public int loseHp(int attackDamage){
        this.currentHealth - attackDamage;
    };
}
