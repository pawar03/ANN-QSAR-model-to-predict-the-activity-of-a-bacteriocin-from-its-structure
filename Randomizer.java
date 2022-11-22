
import java.util.Random;

public class Randomizer {

	public Random random;

	// constructor using system clock
	public Randomizer () {
		random = new Random();
	}

	// constructor using seed
	public Randomizer ( long seed ) {
		random = new Random(seed);
	}

	// Method to generate a uniformly distributed value between two values
	public double Uniform (double min, double max) { // throws ...
		return ( random.nextDouble() * (max - min) ) + min;
	}

}