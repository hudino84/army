package army.soldiers;

import army.soldiers.abstracted.DefensiveSoldier;


public class Archer extends DefensiveSoldier {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    public void coverFire() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " shoots a lot of arrows for cover fire");
    }
}
