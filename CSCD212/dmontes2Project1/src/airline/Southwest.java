package airline;

public class Southwest extends Airline{

    /**
     * Airline name
     * @param name
     */
    public Southwest(String name){
       super("Southwest");
        if(name == null) {
            throw new IllegalArgumentException("Airline name cannot be null.");
        }
    }
}
