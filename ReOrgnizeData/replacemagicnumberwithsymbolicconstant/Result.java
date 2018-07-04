package replacemagicnumberwithsymbolicconstant;

public class Result {
	private final double GRAVITYTIONAL_CONSTANT = 9.81;
	double potentialEnergy(double mass, double height) {
		return mass * GRAVITYTIONAL_CONSTANT * height;
	}
}
