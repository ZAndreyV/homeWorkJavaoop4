package seminar4.warriors;

import seminar4.defence.Defendeble;
import seminar4.weapons.Weapon;
import seminar4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Defendeble>{
    public Archer(String name, int healthPoint, Ranged weapon, Defendeble defendeble) {
        super(name, healthPoint, weapon, defendeble);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}
