package F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
