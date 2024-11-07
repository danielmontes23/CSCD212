package airline;

public class Delta extends Airline{

    /**
     * Airline name
     * @param name
     */
    public Delta(String name) {
        super("Delta");
        if (name == null) {
            throw new IllegalArgumentException("Airline name cannot be null.");
        }
    }
}
