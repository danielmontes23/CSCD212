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
import interfaces.BoardingBehavior;
import interfaces.comfortClassBoarding;
import interfaces.economyClassBoarding;
import interfaces.firstClassBoarding;
import reservations.TicketReservation;
import reservations.reservationBuilder;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Airport selectAirport(Scanner scanner) {
        while (true) {
            System.out.println("Options of airports:");
            System.out.println("1. LAX (Los Angeles International Airport)");
            System.out.println("2. PDX (Portland International Airport)");
            System.out.println("3. Sea-Tac (Seattle-Tacoma International Airport)");
            System.out.println("0. Exit");
            System.out.println("Select an airport:");

            int choice = getIntInput(scanner);

            if (choice == 1) {
                return new LAX();
            } else if (choice == 2) {
                return new PDX();
            } else if (choice == 3) {
                return new SeaTac();
            } else if (choice == 0) {
                System.exit(0);
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Daniel's Ticket/Flight System");
        System.out.println("Please enter the following information:");

        System.out.println("Departure Airport:");
        Airport departureAirport = selectAirport(scanner);
        //System.out.println("Enter an option 0-3: ");

        System.out.println("Destination Airport:");
        Airport destinationAirport = selectAirport(scanner);
        //System.out.println("Enter an option 0-3: ");

        System.out.print("Enter the number of layovers: ");
        int numLayovers = scanner.nextInt();
        scanner.nextLine();

        System.out.print("First and last name of the flyer: ");
        String name = scanner.nextLine();

        System.out.print("Birth month of the flyer: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Birth day of the flyer: ");
        int birthDay = scanner.nextInt();

        System.out.print("Birth year of the flyer: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What seat class?(first class, comfort class, or economy class): ");
        String seatClass = scanner.nextLine();

        System.out.print("Seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Boarding class is: ");
        String boardingClass = scanner.nextLine();

        System.out.print("Number of checked bags: ");
        int checkedBags = scanner.nextInt();

        Aircraft boeing787 = new Boeing787();
        Aircraft boeing737 = new Boeing737();
        Aircraft an225 = new An225();

        TicketReservation reservation = new TicketReservation();
        reservation.addTicket(name, String.valueOf(LocalDate.of(birthYear, birthMonth, birthDay)), seatClass, seatNumber, boardingClass, checkedBags);

        int totalCost = reservation.calculateTotalCost();
        System.out.println("Total cost of the ticket reservation plus checked bags will be: $" + totalCost);

        System.out.println("Ticket added:");
        System.out.println("Name of the passenger: " + name);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Departing from: " + departureAirport.getName());
        System.out.println("Going to: " + destinationAirport.getName());
        System.out.println("Number of layovers: " + numLayovers);
        //BoardingBehavior.boardPassenger(name, seatNumber);

        //System.out.print("Would you like to buy another ticket? (Yes/No): ");
        //String addAnother = scanner.nextLine();
        //if (!addAnother.equalsIgnoreCase("Yes")) {
        //    System.exit(0);
        //}
        BoardingBehavior.boardPassenger(name, seatNumber);
        scanner.close();
    }

        //scanner.close();

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect input, please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
