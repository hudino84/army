package army;

import army.command.Command;
import army.command.CommandType;

import java.util.List;

public class Commander {
    public static List<Command> prepareCommands() {
        return List.of(
                new Command(CommandType.REPORT),
                new Command(CommandType.ATTACK),
                new Command(CommandType.FLANK_ENEMY),
                new Command(CommandType.DEFEND),
                new Command(CommandType.STRONG_DEFEND),
                new Command(CommandType.SWING),
                new Command(CommandType.FALANG),
                new Command(CommandType.COVER_FIRE),
                new Command(CommandType.BURN_LAND),
                new Command(CommandType.SCOUTING),
                new Command(CommandType.INFILTRATE)
        );
    }
}
