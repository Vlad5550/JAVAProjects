import java.time.LocalDate;

class Reservation {
    private String reservationId;
    private String customerName;
    private LocalDate date;

    public Reservation(String reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    public void printInfo() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: Confirmed");
    }

    public void modifyRes(String newCustomerName, LocalDate newDate) {
        this.customerName = newCustomerName;
        this.date = newDate;
        System.out.println("Reservation modified successfully.");
    }

    public String getResId() {
        return reservationId;
    }

    public String getCustName() {
        return customerName;
    }

    public LocalDate getDate() {
        return date;
    }
}

class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationId, String customerName, LocalDate date, int roomNumber) {
        super(reservationId, customerName, date); 
        this.roomNumber = roomNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Room Number: " + roomNumber);
    }

    // Fixed to match parent method name or use consistent naming
    public void modifyRes(String newCustomerName, LocalDate newDate, int newRoomNumber) {
        super.modifyRes(newCustomerName, newDate); 
        this.roomNumber = newRoomNumber;
        System.out.println("Room Number updated successfully.");
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

class RailwayReservation extends Reservation {
    private int seatNumber;

    public RailwayReservation(String reservationId, String customerName, LocalDate date, int seatNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Seat Number: " + seatNumber);
    }

    public void modifyRes(String newCustomerName, LocalDate newDate, int newSeatNumber) {
        super.modifyRes(newCustomerName, newDate); 
        this.seatNumber = newSeatNumber;
        System.out.println("Seat Number updated successfully.");
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

public class ReservationSystem {
    public static void main(String[] args) {
        ResortReservation resortRes = new ResortReservation("RSV001", "Celestino Aspasia", LocalDate.now(), 101);
        resortRes.printInfo();
        System.out.println();

        resortRes.modifyRes("Celestino Aspasia", LocalDate.of(2027, 6, 15), 102);
        resortRes.printInfo();
        System.out.println();

        RailwayReservation railwayRes = new RailwayReservation("RSV002", "John Paul Pythios", LocalDate.now(), 22);
        railwayRes.printInfo();
        System.out.println();

        railwayRes.modifyRes("Bob Smith", LocalDate.of(2024, 6, 20), 23);
        railwayRes.printInfo();
    }
}