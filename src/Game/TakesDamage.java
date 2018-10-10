package Game;

public interface TakesDamage {
    int loseHp();
    int loseMana();
    int gainHp();
    int gainMana();

    void die();

}
