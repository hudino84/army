package army.soldiers.abstracted;
import army.soldiers.types.Scout;

public abstract class ScoutSoldier extends Soldier implements Scout {

    public ScoutSoldier(String name, int damage) {
        super(name, damage, type);
    }

    @Override
    public void scout() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " explores enemy base and brought information ");
    }
}
