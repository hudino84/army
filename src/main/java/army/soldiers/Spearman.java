package army.soldiers;

import army.soldiers.abstracted.DefensiveSoldier;

public class Spearman extends DefensiveSoldier {

    public Spearman(String name, int damage) {
        super(name, damage);
    }

    public void falanga() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " join to close square formation");
    }
}
