package reservations;

import airport.Airport;
import airport.LAX;
import airport.PDX;
import airport.SeaTac;

import airline.Airline;
import airline.Southwest;
import airline.Delta;
import airline.Spirit;

import airplane.Aircraft;
import airplane.Boeing787;
import airplane.Boeing737;

public class Ticket{

    private static final int firstClassPrice = 400;
    private static final int comfortClassPrice = 300;
    private static final int economyClassPrice = 200;
    private static final int checkedBagsCost = 50;


    private String name;
    private String birthDay;
    private String seatClass;
    private String seatNum;
    private String boardingClass;
    private int checkedBags;
    private int ticketCount;


    /**
     * Makes the ticket with these parameters below and must include all of them
     * @param name
     * @param birthDay
     * @param seatClass
     * @param seatNum
     * @param boardingClass
     * @param checkedBags
     */
    public Ticket(String name, String birthDay, String seatClass, String seatNum, String boardingClass, int checkedBags){
        if(name == null || birthDay == null || birthDay.isBlank() || seatClass == null || seatClass.isBlank())
            throw new IllegalArgumentException("Strings in the Ticket Constructor are null.");

        this.name = name;
        this.birthDay = birthDay;
        this.seatClass = seatClass;
        this.seatNum = seatNum;
        this.boardingClass = boardingClass;
        this.checkedBags = checkedBags;
    }

    /**
     * calculate the cost depending on which seatClass added to the price of checked bags
     * @return cost
     */
    public int calculateCost(){
        int cost = 0;
        if(seatClass.equals("First Class") || seatClass.equals("first class") || seatClass.equals("First") || seatClass.equals("first")  || seatClass.equals("FIRST")){
            cost = firstClassPrice;
        }
        if(seatClass.equals("Economy Class") || seatClass.equals("economy class") || seatClass.equals("Economy") || seatClass.equals("economy") || seatClass.equals("ECONOMY")){
            cost = economyClassPrice;
        }
        if(seatClass.equals("Comfort Class") || seatClass.equals("comfort class") || seatClass.equals("Comfort") || seatClass.equals("comfort") || seatClass.equals("COMFORT")){
            cost = comfortClassPrice;
        }
        return cost + checkedBags * checkedBagsCost;
    }
}
