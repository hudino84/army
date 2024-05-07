package army;

import army.soldiers.*;
import army.soldiers.abstracted.Soldier;

import java.util.List;

public class Army {
    public static List<Soldier> createArmy() {
        final Archer archer1 = new Archer("Archer 1", 2);
        final Archer archer2 = new Archer("Archer 2", 2);

        final Knight knight1 = new Knight("Knight 1", 3);
        final Knight knight2 = new Knight("Super Knight Warrior", 10);

        final Swordsman swordsman1 = new Swordsman("Swordsman 1", 5);
        final Swordsman swordsman2 = new Swordsman("Swordsman 2", 5);

        final Spearman spearman1 = new Spearman("Spearman 1", 4);
        final Spearman spearman2 = new Spearman("Spearman 2", 4);

        final Burner burner1 = new Burner("Burner 1", 100);
        final Scout scout1 = new Scout("Scout 1", 20);
        final Scout scout2 = new Scout("Scout 2", 20);
        final Spy spy1 = new Spy("Bond", 500);


        return List.of
                (archer1,
                archer2,
                knight1,
                knight2,
                swordsman1,
                swordsman2,
                spearman1,
                spearman2,
                burner1,
                scout1,
                scout2,
                spy1);
    }
}
