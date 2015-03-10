package pattern.command;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Computer comp = new Computer();
		StartCommand switchUp = new StartCommand(comp);
		StopCommand switchDown = new StopCommand(comp);
		Switch mySwitch = new Switch();
		Scanner scn = new Scanner(System.in);
		String cmd = "NONE";
		do {
			switch (cmd) {
			case "ON":
				mySwitch.storeAndExecute(switchUp);
				break;
			case "OFF":
				mySwitch.storeAndExecute(switchDown);
				break;
			default:
				System.out.println("type ON or OFF or q to quit");
				break;
			}
			cmd = scn.nextLine();
			if (cmd.equals("q")) {
				System.out.println("Quiting...");
			}
		} while (!cmd.equals("q"));
		scn.close();
	}
}
