package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

import java.time.LocalDate;

public class FlightBooking {
private String flightCompany = "Flights-of-Fancy";
private String flightID = "AkA123321";
private String passengerFullName;
private double departingTicketPrice;
private double returnTicketPrice;
private double totalTicketPrice; private String ticketNumber;
private LocalDate departureDate;
private LocalDate returnDate;
private int childPassengers;
private int adultPassengers;
private int totalPassengers;
private BookingClass Bookingclass;
private TripSource Tripsource;
private SourceAirport sourceairport;
private DestinationAirport destinationairport;
private TripType Triptype;
private TripDestination Tripdestination;



public static String usingMath(int length) {
    String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "0123456789";
    String allCharacters = alphabetsInUpperCase + numbers;
    StringBuilder a = new StringBuilder();
    for (int i = 0; i < length; i++) {
        int randomIndex = (int) (Math.random() * allCharacters.length());
        a.append(allCharacters.charAt(randomIndex));
    }
    return a.toString();
}

    public enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }

    public enum  TripType{
        ONE_WAY, RETURN;
    }

    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    public enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;

        public boolean eequal(TripDestination tripDestination) {
            return false;
        };
    }

    public enum SourceAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }

    public enum DestinationAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }

    public FlightBooking(String passengerFullName, LocalDate depart, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
         
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    public String getFlightID()  {
        return flightID;
    }
    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }
    public String getPassengerFullName() {
        return passengerFullName;
    }
    
    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }
    public int getChildrenPassengers() {
        return childPassengers;
    }
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }
    public int getAdultPassengers() {
        return adultPassengers;
    }


    public void setTotalPassengers(int adultPassengers,int childPassengers){
        this.totalPassengers = adultPassengers + childPassengers;
        }
    public int getTotalPassengers() {
        return totalPassengers;
    }

   
   public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getDepartingDate() {
        return departureDate;
    }
    public void setReturnDate(LocalDate returnDate) {
         long between = returnDate.toEpochDay()-departureDate.toEpochDay();
         if(between >= 2){
         this.returnDate = returnDate;
         }else{
         this.returnDate = departureDate.plusDays(2);
         }
        }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBookingClass(String x1) {;
        switch(x1) {
            case "1":
            Bookingclass = BookingClass.FIRST;
            break;
            case "2":
            Bookingclass = BookingClass.BUSINESS;
            break;
            case "3":
            Bookingclass = BookingClass.ECONOMY;
            break;
            default :
            System.out.println("Wrong message.");
        }
    }
    public BookingClass getBookingclass() {
        return Bookingclass;
    }


    public void setTripType(String x2) {    
        switch(x2) {
            case "1":
            Triptype = TripType.ONE_WAY;
            break;
            case "2":
            Triptype = TripType.RETURN;
            break;
            default :
            System.out.println("Wrong message.");
        }
    }
    public TripType getTriptype() {
        return Triptype;
    }


    public void setTripSource(String x3) {  
        switch(x3) {
            case "1":
            Tripsource = TripSource.NANJING;
            break;
            case "2":
            Tripsource = TripSource.BEIJING;
            break;
            case "3":
            Tripsource = TripSource.OULU;
            break;
            case "4":
            Tripsource = TripSource.HELSINKI;
            break;
            default :
            System.out.println("Wrong message.");
        }
    }
    public TripSource getTripSource() {
        return Tripsource;
    }

    public void setSourceAirport(String x3) {
         if(x3.equals(TripSource.NANJING)){
         this.sourceairport = SourceAirport.Nanjing_Lukou_International_Airport;}
         else if(x3.equals(TripSource.BEIJING)){
         this.sourceairport = SourceAirport.Beijing_Capital_International_Airport;}
         else if(x3.equals(TripSource.OULU)){
        this.sourceairport = SourceAirport.Oulu_Airport;}
         else if(x3.equals(TripSource.HELSINKI)){
         this.sourceairport = SourceAirport.Helsinki_Airport;}
         }
    public SourceAirport getSourceAirport() {
        return sourceairport;
    }


    public void setTripDestination(String x3, String z) {
        if(!x3.equals(z)) {
            switch(z) {
            case "1":
            Tripdestination = TripDestination.NANJING;
            break;
            case "2":
            Tripdestination = TripDestination.BEIJING;
            break;
            case "3":
            Tripdestination = TripDestination.OULU;
            break;
            case "4":
            Tripdestination = TripDestination.HELSINKI;
            break;
            default :
            System.out.println("Wrong Message.");
            }
        } else {
            System.out.println("The trip source and the trip destination should not be the same!");
        }
    }
    public TripDestination getTripDestination() {
        return Tripdestination;
    }


    public void setDestinationAirport(String x4) {
         if(x4.equals(TripDestination.NANJING)){
         this.destinationairport= DestinationAirport.Nanjing_Lukou_International_Airport;}
         else if(x4.equals(TripDestination.BEIJING)){
         this.destinationairport = DestinationAirport.Beijing_Capital_International_Airport;}
         else if(x4.equals(TripDestination.OULU)){
         this.destinationairport = DestinationAirport.Oulu_Airport;}
         else if(x4.equals(TripDestination.HELSINKI)){
         this.destinationairport = DestinationAirport.Helsinki_Airport;}
         else if(x4.equals(TripDestination.SHANGHAI)){
         this.destinationairport = DestinationAirport.Shanghai_Pudong_International_Airport;}
         else if(x4.equals(TripDestination.PARIS)){
         this.destinationairport = DestinationAirport.Paris_Charles_de_Gaulle_Airport;}
    }
    public DestinationAirport getDestinationAirport() {
        return destinationairport;
    }

    
    public String getTicketNumber() {
        String Ticketnumber;
        String w = usingMath(4);
        if(Triptype == (TripType.ONE_WAY)) {
            Ticketnumber = "11";
            if(Bookingclass == (BookingClass.FIRST)){
                Ticketnumber = Ticketnumber + "F" + w;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI) ){
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.BUSINESS) {
                Ticketnumber = Ticketnumber + "B" + w;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.HELSINKI ) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.ECONOMY) {
                Ticketnumber = Ticketnumber + "E" + w;
                if((Tripsource == TripSource.OULU  || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
        } else {
            Ticketnumber = "22";
            if(Bookingclass == (BookingClass.FIRST)){
                Ticketnumber = Ticketnumber + "F" + w;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI) ){
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.BUSINESS) {
                Ticketnumber = Ticketnumber + "B" + w;
                if((Tripsource == TripSource.OULU || Tripsource == TripSource.HELSINKI ) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            } else if(Bookingclass == BookingClass.ECONOMY) {
                Ticketnumber = Ticketnumber + "E" + w;
                if((Tripsource == TripSource.OULU  || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
                    Ticketnumber = Ticketnumber + "DOM"; 
                } else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING ) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING )) {
                    Ticketnumber = Ticketnumber + "DOM";
                } else {
                    Ticketnumber = Ticketnumber + "INT";
                }
            }
            }
            return Ticketnumber;
        }

    
    

    


    public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
        double departingTicketPrice = 0;
        if((Tripsource == TripSource.OULU || Tripsource == TripSource.PARIS || Tripsource == TripSource.HELSINKI) && (Tripdestination == TripDestination.PARIS || Tripdestination == TripDestination.OULU || Tripdestination == TripDestination.HELSINKI)) {
            departingTicketPrice = 345;
        }else if((Tripsource == TripSource.NANJING || Tripsource == TripSource.BEIJING || Tripsource == TripSource.SHANGHAI) && (Tripdestination == TripDestination.NANJING || Tripdestination == TripDestination.BEIJING || Tripdestination == TripDestination.SHANGHAI)){
            departingTicketPrice = 345;
        }
        else {
            departingTicketPrice = 375;
        }
        if(Bookingclass == BookingClass.FIRST) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 250;
        } else if(Bookingclass == BookingClass.BUSINESS) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
        } else if(Bookingclass == BookingClass.ECONOMY) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
        }
    }

    public void setReturnTicketPrice() {
        if(Triptype == TripType.ONE_WAY) {
            this.returnTicketPrice = 0;
        } else {
            this.returnTicketPrice = this.departingTicketPrice;
        }
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = this.departingTicketPrice + this.returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        return this.totalTicketPrice;
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +  flightCompany + 
        ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + Tripsource + " to " + Tripdestination + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice;}

}
