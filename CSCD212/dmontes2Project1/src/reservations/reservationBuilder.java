package reservations;

import java.util.List;
import java.util.ArrayList;

public class reservationBuilder {
    private int ticketCount;
    private List<layOver> layovers;
    private TicketReservation reservation;

    /**
     * adding the layover
     * @param layover
     */
    public void addLayover(layOver layover) {
        layovers.add(layover);
    }

    /**
     * Building the reservations
     */
    public reservationBuilder() {
        this.layovers = new ArrayList<>();
        this.ticketCount = 0;
    }


    /**
     * setting the ticket count
     * @param ticketCount
     */
    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    /**
     * gets reservation
     * @return
     */
    public TicketReservation getReservation() {
        return reservation;
    }
}
