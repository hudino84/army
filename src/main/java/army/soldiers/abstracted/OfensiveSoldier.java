package army.soldiers.abstracted;
import army.soldiers.types.Offensive;

public abstract class OfensiveSoldier extends Soldier implements Offensive {

    public OfensiveSoldier(String name, int damage) {
        super(name, damage, type);
    }

    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " attack deals " + this.getDamage() + " damage");
    }
}
