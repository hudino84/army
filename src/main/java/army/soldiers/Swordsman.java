package army.soldiers;

import army.soldiers.abstracted.AdaptableSoldier;

public class Swordsman extends AdaptableSoldier {

    public Swordsman(String name, int damage) {
        super(name, damage);
    }

    public void swing() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " swing the enemies with a wide arc");
    }

}
