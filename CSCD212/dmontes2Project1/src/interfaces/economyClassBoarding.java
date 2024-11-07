package interfaces;

public class economyClassBoarding implements BoardingBehavior{
    private String name;
    private String seatNum;

    public economyClassBoarding(String name, String seatNum) {
        if(name == null || seatNum == null)
            throw new IllegalArgumentException("Bad Parameters economy.");
        this.name = name;
        this.seatNum = seatNum;
    }

//    public static void boardPassenger(String name, String seatNum) {
//        System.out.println("Boarding " + name + " into economy class seat " + seatNum);
//    }
}
