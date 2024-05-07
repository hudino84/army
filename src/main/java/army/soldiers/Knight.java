package army.soldiers;

import army.soldiers.abstracted.OfensiveSoldier;

public class Knight extends OfensiveSoldier {

    public Knight(String name, int damage) {
        super(name, damage);
    }

    public void flank() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " is flanking");
    }
}
