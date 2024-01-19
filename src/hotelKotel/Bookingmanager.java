package hotelKotel;

import java.util.ArrayList;
import java.util.List;

public class Bookingmanager {
    private List<Booking> bookings;
    private List<Guest> guests;


    public Bookingmanager() {
        this.bookings = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public void clearbookings() {
        bookings = new ArrayList<>();
    }
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void addBooking(Booking book) {
        bookings.add(book);
    }

    public Booking getbooking(int index) {
        return bookings.get(index);
    }
    public List<Booking> getbookings() {
       return bookings;
    }
    public int getNumberOfWorkingBookings(){
        //number of working bookings
        int nowb = 0;
        for (Booking book:bookings) {
            if (book.getTypeofvacation()) {
                nowb++;
            }
        }
        return nowb;
    }
    public List<Guest> getGuests(){
       return guests;
    }
    public int getAverageGuests() {
        int totalGuests = 0;
        for (Booking book:bookings) {
            totalGuests += book.getTotalGuests();
        }
        return totalGuests / bookings.size();
    }
    public Guest getGuest(int index){
        return guests.get(index);
    }
    public int getPrice(Booking booking) {
        return booking.getCena();
    }
    public int boookingsWith1Guest() {
        int oneGuest = 0;
        for (Booking book:bookings) {
            if (book.getTotalGuests() == 1) {
                oneGuest++;
            }
        }
        return oneGuest;
    }

    public int bookingswith2Guests() {
        int twoGuest = 0;
        for (Booking book:bookings) {
            if (book.getTotalGuests() == 2) {
                twoGuest++;
            }
        }
        return twoGuest;
    }
    public int bookingswithMoreThen2Guests() {
        int moreGuest = 0;
        for (Booking book:bookings) {
            if (book.getTotalGuests() > 2) {
                moreGuest++;
            }
        }
        return moreGuest;
    }
}
