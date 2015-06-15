public class Robot {

	private int id;
	
	//has access to instance variables of Robot
	//good for logically grouping classes
	// typically private
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	// does not have access to non-static instance variables
	// basically a standalone class. It's just logically
	// grouped with Robot
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		// when you create an instance of robot, you're
		// not actually creating an instance of Brain
		// automatically. You need to do it explicitly
		Brain brain = new Brain();
		brain.think();
		
		String name = "Robert";
		
		// has access to instance variables of Robot and
		// local variables of the containing method
		class Temp {
			public void doSomething() {
				System.out.println("ID is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}

}
