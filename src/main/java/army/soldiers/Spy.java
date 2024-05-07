package army.soldiers;

import army.soldiers.abstracted.Soldier;
import army.soldiers.types.SoldierType;

public class Spy extends Soldier {

    public Spy(String name, int damage) {
        super(name, damage, SoldierType.SPY);
    }

    @Override
    public void report() {
        System.out.println("I am a shadow" + this.getType());
    }

    public void infiltrate() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() +
                " infiltrate enemy base and cause " + this.getDamage() + " damage");
    }
}
