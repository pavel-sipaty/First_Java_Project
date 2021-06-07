package Completed;

public class Fighter {

    public String name;
    public int health, damagePerAttack;

    Fighter(){

    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public double strength(int power) {
        double strength = power * 0.35;
        return strength;
    }

}
