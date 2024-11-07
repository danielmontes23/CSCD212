package reservations;

import airline.Airline;
import airplane.Aircraft;
import airport.Airport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TicketReservation {
    private Aircraft aircraft;
    private String destinationAirport;
    private LocalDate flightTime;
    private Airline airline;
    private List<Ticket> tickets;
    private String destination;
    private List<Airport> layoverAirports;
    private List<Integer> layoverDurations;
    private int ticketCount;
    private String destinationAirportCode;
    private List<layOver> layovers;

    /**
     * Constructor for the TicketReservation
     */
    public TicketReservation() {
        this.aircraft = aircraft;
        this.destinationAirport = destinationAirport;
        this.flightTime = flightTime;
        this.airline = airline;
        this.destination = destination;
        this.tickets = new ArrayList<>();
        this.layoverDurations = new ArrayList<>();
        this.layoverAirports = new ArrayList<>();
        this.ticketCount = 0;
        this.destinationAirportCode = destinationAirport; // Assuming destinationAirportCode should be set to destinationAirport
    }

    /**
     * Adds tickets with all the parameters in the method
     *
     * @param name
     * @param birthDate
     * @param seatClass
     * @param seatNumber
     * @param boardingClass
     * @param checkedBags
     */
    public void addTicket(String name, String birthDate, String seatClass, String seatNumber, String boardingClass, int checkedBags) {
        Ticket ticket = new Ticket(name, birthDate, seatClass, seatNumber, boardingClass, checkedBags);
        tickets.add(ticket);
        ticketCount++;
    }

    /**
     * Calculates the total cost
     *
     * @return
     */
    public int calculateTotalCost() {
        int totalCost = 0;
        for (Ticket ticket : tickets) {
            totalCost += ticket.calculateCost();
        }
        return totalCost;
    }

    /**
     * Set the destination
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Set the destination Airport
     *
     * @param destinationAirport
     */
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /**
     * set ticket count
     *
     * @param ticketCount
     */
    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    /**
     * return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Get the airport code
     *
     * @return
     */
    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }
}