
public class App {

	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		// never used this way, but it's possible
		// will only work if Brain is declared as public
		//Robot.Brain brain = robot.new Brain();
		//brain.think();
		
		//pretty common to see this though
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
