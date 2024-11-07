package interfaces;

public interface BoardingBehavior {
    /**
     * Prints out the flyer and his seat number
     * @param name
     * @param seatNum
     */
    static void boardPassenger(String name, String seatNum) {
        System.out.println("Boarding: " + name + " into the seat " + seatNum);
    }
}
