// Параметри для всіх класів

public class CharacterAttributes {
    private int health;
    private int attackPower;

    public CharacterAttributes(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }
}

