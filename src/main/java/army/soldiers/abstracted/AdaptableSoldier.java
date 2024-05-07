package army.soldiers.abstracted;
import army.soldiers.types.Adaptable;

public abstract class AdaptableSoldier extends Soldier implements Adaptable {

    public AdaptableSoldier(String name, int damage) {
        super(name, damage, type);
    }

    public void defend() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " defend and deals " + this.getDamage() + " damage");
    }

    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " attack deals " + this.getDamage() + " damage");
    }
}
