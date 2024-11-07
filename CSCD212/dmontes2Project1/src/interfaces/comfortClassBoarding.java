package interfaces;

public class comfortClassBoarding implements BoardingBehavior{
    private String name;
    private String seatNum;

    public comfortClassBoarding(String name, String seatNum) {
        if(name == null || seatNum == null)
            throw new IllegalArgumentException("Bad Parameters comfort.");
        this.name = name;
        this.seatNum = seatNum;
    }

//    public static void boardPassenger(String name, String seatNum) {
//        System.out.println("Boarding " + name + " into comfort class seat " + seatNum);
//    }
}
