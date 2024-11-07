package airline;

public class Spirit extends Airline{

    /**
     * Airline name
     * @param name
     */
    public Spirit(String name){
        super("Sprint");
        if(name == null) {
            throw new IllegalArgumentException("Airline name cannot be null.");
        }
    }
}
