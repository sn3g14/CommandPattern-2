package pattern.command;

public class StartCommand implements Command {
	private Computer comp;
	
	public StartCommand(Computer comp) {
		this.comp = comp;
	}
	@Override
	public void execute() {
		this.comp.turnOn();
	}
}
