package army.command;

import army.soldiers.*;
import army.soldiers.abstracted.ScoutSoldier;
import army.soldiers.abstracted.Soldier;
import army.soldiers.types.Defensive;
import army.soldiers.types.Offensive;

public enum CommandType implements iCommand {
    REPORT {
        @Override
        public void execute(Soldier soldier) {
            soldier.report();
        }
    },
    ATTACK {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Offensive) {
                ((Offensive) soldier).attack();
            }
        }
    },
    DEFEND {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Defensive) {
                ((Defensive) soldier).defend();
            }
        }
    },
    STRONG_DEFEND {
        public void execute(Soldier soldier) {
            if(soldier instanceof Defensive) {
                soldier.setDamage(soldier.getDamage() * 2);
                ((Defensive) soldier).defend();
            }
        }
    },
    SWING {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Swordsman) {
                ((Swordsman) soldier).swing();
            }
        }
    },
    FALANG {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Spearman) {
                ((Spearman) soldier).falanga();
            }
        }
    },
    FLANK_ENEMY {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Knight) {
                ((Knight) soldier).flank();
            }
        }
    },
    COVER_FIRE {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Archer) {
                ((Archer) soldier).coverFire();
            }
        }
    },
    BURN_LAND {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Burner) {
                ((Burner) soldier).schorchedEarth();
            }
        }
    },
    SCOUTING {
        @Override
        public void execute(Soldier soldier) {
            if (soldier instanceof ScoutSoldier) {
                ((ScoutSoldier) soldier).scout();
            }
        }
    },
    INFILTRATE {
        @Override
        public void execute(Soldier soldier) {
            if(soldier instanceof Spy) {
                ((Spy) soldier).infiltrate();
            }
        }
    }

}
