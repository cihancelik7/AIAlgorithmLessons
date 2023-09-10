package SimulatedAnnealing;

public class Constants {
    private Constants() {

    }

    public static final double MIN_COORDINATE_X = -2;
    public static final double MAX_COORDINATE_X = 2;
// temperature controls what states to accept amd consider
    public static final double MIN_TEMPERATURE = 1;
    public static final double MAX_TEMPERATURE = 100;
    // if the cooling rate is large - we consider just a few states in the search space
    // the cooling rate controls the number of states
    // the algorithm will consider
    public static final double COOLING_RATE = 0.02;


}
