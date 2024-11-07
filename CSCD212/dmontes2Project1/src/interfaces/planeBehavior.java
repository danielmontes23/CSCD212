package interfaces;

//import airport.Airport;

public interface planeBehavior{

        int getArrivalTime();
        int getDepartTime();

        /**
         * The getLocation method
         * Returns:
         * String Representing the location
         * @return
         */
        String getLocation();
}
