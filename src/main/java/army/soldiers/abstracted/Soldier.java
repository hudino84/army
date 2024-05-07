package army.soldiers.abstracted;

import army.soldiers.types.SoldierType;

public abstract class Soldier {
    private final String name;
    private int damage;
    private final SoldierType type;

    public Soldier(String name, int damage, SoldierType type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public void report() {
        System.out.println("Soldier " + this.name + " here. Type - " + this.type);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public SoldierType getType() {
        return type;
    }
}