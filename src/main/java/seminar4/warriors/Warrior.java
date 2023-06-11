package seminar4.warriors;

import seminar4.defence.Defendeble;
import seminar4.weapons.Weapon;

import java.util.Random;


public abstract class Warrior<W extends Weapon, D extends Defendeble> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private D defend;

    public Warrior(String name, int healthPoint, W weapon, D defend) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defend = defend;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public D getDefend() {
        return defend;
    }

    public void setDefend(D defend) {
        this.defend = defend;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);

    }


    public void reduceHealth(int damage) {
        healthPoint -= damage - defend.getDefence();
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Defend: %d", name, weapon, healthPoint, defend.getDefence());
    }
}
