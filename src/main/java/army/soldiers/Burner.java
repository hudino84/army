package army.soldiers;

import army.soldiers.abstracted.DefensiveSoldier;

public class Burner extends DefensiveSoldier {

    public Burner(String name, int damage) {
        super(name, damage);
    }

    public void schorchedEarth() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " burned the entire land to ashes");
    }
}
