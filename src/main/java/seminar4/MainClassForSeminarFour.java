package seminar4;

import seminar4.defence.HeavyShield;
import seminar4.defence.LightShield;
import seminar4.warriors.Archer;
import seminar4.warriors.Infantryman;
import seminar4.warriors.Warrior;
import seminar4.weapons.meleeWeapon.Axe;
import seminar4.weapons.meleeWeapon.Sword;
import seminar4.weapons.rangedWeapon.Bow;
import seminar4.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new LightShield()));
        team1.add(new Infantryman("John", 150,new Axe(), new HeavyShield()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new LightShield()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new LightShield()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new HeavyShield()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe(), new HeavyShield()), (new Archer("Robin", 100, new Bow(), new LightShield())));

        battle1.fight();

        System.out.println(team1.getMinTeamShield());

    }
}
