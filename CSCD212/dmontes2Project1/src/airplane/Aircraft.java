package airplane;

public abstract class Aircraft {
    private String name;
    private int numOfRows;
    private int numOfSeatsPerRow;
    private int totalSeats;

    /**
     * @param name
     * @param numOfRows
     * @param numOfSeatsPerRow
     * @param totalSeats
     */
    public Aircraft(String name, int numOfRows, int numOfSeatsPerRow, int totalSeats){
        if(name == null || name.isBlank() || numOfRows < 0 || numOfSeatsPerRow < 0 || totalSeats < 0) {
            throw new IllegalArgumentException("Bad parameters in the Aircraft constructor.");
        }
        this.name = name;
        this.numOfRows = numOfRows;
        this.numOfSeatsPerRow = numOfSeatsPerRow;
        this.totalSeats = totalSeats;
    }
}
