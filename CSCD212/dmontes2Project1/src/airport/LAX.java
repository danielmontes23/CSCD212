package airport;

public class LAX extends Airport{
    //private static final String code = "Los Angeles Airport";
    public LAX() {
        super("Los Angeles Airport", "LAX");
    }

    /**
     * Landing location
     * @return
     */
    public String getLocation(){
        return "You will land in " + getClass().getName() + "airport.";
    }
}
