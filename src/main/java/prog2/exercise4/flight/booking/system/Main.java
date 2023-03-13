package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;


public class Main
{
    private static final LocalDate departuredate = null;
    private static final LocalDate returnDate = null;

    public static void main( String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        FlightBooking a = new FlightBooking("Mike", departuredate, returnDate, 1, 2); 
       
        System.out.println("Please pick the number of class you would like to travel in > " );
        System.out.println("1.First2.Busniess3.Econemy");
        String x1 = myscanner.nextLine();
        a.setBookingClass(x1);
        FlightBooking.BookingClass BookingClass = a.getBookingclass();
        
       
        System.out.println("Please pick the choice(number) of 1.One way 2.Return ");
        String x2 = myscanner.nextLine();
        a.setTripType(x2);
        FlightBooking.TripType triptype = a.getTriptype();


         System.out.println("Please pick the number of tripsouce you would like to travel" );
         System.out.println("1.Nanjing");
         System.out.println("2.Beijing");
         System.out.println("3.Oulu");
         System.out.println("4.Helsinki");
         String x3 = myscanner.nextLine();
         a.setTripSource(x3);
        FlightBooking.TripSource result = a.getTripSource();

        a.setSourceAirport(x3);
        
         System.out.println("Please pick the number of tripdestination you would like to go" );
         System.out.println("1." + "Nanjing");
         System.out.println("2." + "Beijing");
         System.out.println("3." + "Oulu");
         System.out.println("4." + "Helsinki");
         String x4 = myscanner.nextLine();
         a.setTripDestination(x3,x4);
        FlightBooking.TripDestination result2 = a.getTripDestination();

        a.setDestinationAirport(x4); 
        
        System.out.println("Please input your date of departure:");
        String a1 = myscanner.nextLine();
        LocalDate departure = LocalDate.parse(a1);
        a.setDepartureDate(departure);
        LocalDate departureDate = a.getDepartingDate();
        System.out.println("Please input your date of returning:");
        String a2 = myscanner.nextLine();
        LocalDate returningDate = LocalDate.parse(a2);
        

        String ticketNumber = a.getTicketNumber();
        
        System.out.println("Dear passenger please input Your FullName:");
        String passengerFullName = myscanner.nextLine();
        System.out.println("Dear passenger please input the number of childpassengers:");
        int childpassengers = myscanner.nextInt();
        System.out.println("Dear passenger please input the number of adultpassengers:");
        int adultpassengers = myscanner.nextInt();
        myscanner.close();
        String company = a.getFlightCompany();
        a.setTotalPassengers(adultpassengers, childpassengers);
        int totalPassengers = a.getTotalPassengers();

        a.setDepartingTicketPrice(childpassengers,adultpassengers);
        a.setReturnTicketPrice();
        a.setTotalTicketPrice();
        double totalTicketPrice = a.getTotalTicketPrice();
      
        
        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " +  
        company + ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + result + " to " + result2 + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice);
       }
}
    
