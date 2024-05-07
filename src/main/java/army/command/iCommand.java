package army.command;

import army.soldiers.abstracted.Soldier;

public interface iCommand {
    void execute(Soldier soldier);
}
