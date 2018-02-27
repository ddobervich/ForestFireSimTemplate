public class NonGUI {
	public static void main(String[] args) {
		// A non-graphical runner for doing a lot
		// of simulations and displaying the results
		Simulator sim = new Simulator(100, 100);

		for (int trial = 0; trial < 100; trial++) {
			sim.reset();					// reset simulator for another random simulation
			sim.run();						// run simulation until fires burn out
			sim.displayInfo();		// display statistics you care about
		}

	}
}
