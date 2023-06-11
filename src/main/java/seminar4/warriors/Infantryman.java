package seminar4.warriors;

import seminar4.defence.Defendeble;
import seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Defendeble>{

    public Infantryman(String name, int healthPoint, Melee weapon, Defendeble defendeble) {
        super(name, healthPoint, weapon, defendeble);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
