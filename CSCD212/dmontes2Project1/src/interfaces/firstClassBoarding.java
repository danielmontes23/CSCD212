package interfaces;

public class firstClassBoarding implements BoardingBehavior{
    private String name;
    private String seatNum;

    public firstClassBoarding(String name, String seatNum) {
        if(name == null || seatNum == null)
            throw new IllegalArgumentException("Bad Parameters first.");
        this.name = name;
        this.seatNum = seatNum;
    }

//    public static void boardPassenger(String name, String seatNum) {
//        System.out.println("Boarding " + name + " into first class seat " + seatNum);
//    }
}
