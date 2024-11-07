package reservations;


public class layOver {
    int hour;
    int minutes;
    int airportCode;

    /**
     * Layover time and airport code
     * @param hour
     * @param minutes
     * @param airportCode
     */
    public layOver(int hour, int minutes, int airportCode){
        if(airportCode == 0)
            throw new IllegalArgumentException("Bad parameters.");
        this.hour = hour;
        this.minutes = minutes;
        this.airportCode = airportCode;
    }
}
