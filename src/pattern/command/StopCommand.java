package pattern.command;

public class StopCommand implements Command {
	private Computer comp;
	
	public StopCommand(Computer comp) {
		this.comp = comp;
	}
	@Override
	public void execute() {
		this.comp.turnOff();
	}
}
