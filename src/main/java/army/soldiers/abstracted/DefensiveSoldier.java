package army.soldiers.abstracted;
import army.soldiers.types.Defensive;

public abstract class DefensiveSoldier extends Soldier implements Defensive {

    public DefensiveSoldier(String name, int damage) {
        super(name, damage, type);
    }

    public void defend() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " defend and deals " + this.getDamage() + " damage");
    }
}
