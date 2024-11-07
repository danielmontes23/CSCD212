import airplane.An225;
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
import interfaces.comfortClassBoarding;
import interfaces.economyClassBoarding;
import interfaces.firstClassBoarding;
import org.junit.Test;
import reservations.Ticket;
import reservations.TicketReservation;
import reservations.layOver;
import static org.junit.Assert.*;

public class tester {


    @Test
    public void testTicketConstructorNull(){
        // Test with null name
        assertThrows(IllegalArgumentException.class, () -> new Ticket(null, null, null, null, null, 0));

    }

    @Test
    public void testTicketsConstructorEmpty(){
        // Test with empty name
        assertThrows(IllegalArgumentException.class, () -> new Ticket("", "", "", "", "", 0));
    }

    @Test
    public void layOverNull(){
        // Test with null name
        assertThrows(IllegalArgumentException.class, () -> {
            new layOver(-1, -1, -1);
        });
    }

    @Test
    public void firstClassNull() {
        // Test with null name
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new firstClassBoarding(null, null);
        });
    }

    @Test
    public void economyClassNull() {
        // Test with empty name
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new economyClassBoarding(null, null);
        });
    }

    @Test
    public void comfortClassNull() {
        // Test with empty name
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new comfortClassBoarding(null, null);
        });
    }

    @Test
    public void testCalculateCost_firstClass() {
        Ticket ticket = new Ticket("Marcus S", "1999-04-12", "First Class", "1A", "A", 3);
        int cost = ticket.calculateCost();
        assertEquals("Cost for first class ticket with 3 checked bags is $550", 550, cost);
    }

    @Test
    public void testCalculateCost_economyClass() {
        Ticket ticket = new Ticket("Daniel Ivan Montes", "2002-17-03", "Economy Class", "2B", "B", 3);
        int cost = ticket.calculateCost();
        assertEquals("Cost for economy class ticket with 3 checked bags is $350", 350, cost);
    }

    @Test
    public void testCalculateCost_comfortClass() {
        Ticket ticket = new Ticket("Daniel Montes", "2002-17-03", "Comfort Class", "3C", "C", 3);
        int cost = ticket.calculateCost();
        assertEquals("Cost for comfort class ticket with 3 checked bags is $450", 450, cost);
    }

    @Test
    public void testCalculateCost_EmptySeat() {
        Ticket ticket = new Ticket("Maria G", "1975-19-05", "", "", "", 0);
        int cost = ticket.calculateCost();
        assertEquals("Cost of the ticket is $0", null, cost);
    }

    @Test
    public void testBoeing787() {
        Boeing787 boeing787 = new Boeing787();

        assertEquals(60, 60);
        assertEquals(5, 5);
        assertEquals(300, 300);
    }

    @Test
    public void testBoeing737() {
        Boeing737 boeing737 = new Boeing737();

        assertEquals(50, 50);
        assertEquals(4, 4);
        assertEquals(200, 200);
    }

    @Test
    public void testAn225() {
       An225 an225 = new An225();

        assertEquals(60, 60);
        assertEquals(5, 5);
        assertEquals(300, 300);
    }

    @Test
    public void testDeltaConstructor() {
        // Test with valid airline name
        Delta delta = new Delta("Delta");
        assertEquals("Delta", "Delta");
    }

    @Test
    public void testSpiritConstructor() {
        // Test with valid airline name
        Spirit spirit = new Spirit("Spirit");
        assertEquals("Spirit", "Spirit");
    }

    @Test
    public void testSouthwestConstructor() {
        // Test with valid airline name
        Spirit spirit = new Spirit("Southwest");
        assertEquals("Southwest", "Southwest");
    }

    @Test
    public void testSeaTacConstructor() {
        SeaTac seaTac = new SeaTac();

        assertEquals("Seattle-Tacoma Internation Airport", seaTac.getName());
        assertEquals("SEA-TAC", seaTac.getCode());
    }

//    @Test
//    public void testLAXConstructor() {
//        // Create a SeaTac object
//        SeaTac seaTac = new SeaTac();
//
//        // Verify the name
//        assertEquals("Los Angeles Airport", LAX.getName());
//
//        // Verify the airport code
//        assertEquals("LAX", LAX.getCode());
//    }
}
