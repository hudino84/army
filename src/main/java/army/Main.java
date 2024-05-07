package army;

import army.command.Command;
import army.soldiers.abstracted.Soldier;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Soldier> soldiers = Army.createArmy();

        List<Command> commands = Commander.prepareCommands();

        for (Command command : commands) {
            System.out.println("-------- " + command.getType() + " --------");
            for (Soldier soldier : soldiers) {
                command.getType().execute(soldier);
            }
            System.out.println();
        }
    }
}