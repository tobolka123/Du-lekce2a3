import hotelKotel.Booking;
import hotelKotel.Guest;
import hotelKotel.Pokoj;
import hotelKotel.Bookingmanager;

import java.time.LocalDate;

public class Main {
    public static void fillBookings() {
        Pokoj pokoj1 = new Pokoj(1,
                1000, true,
                true);
        Pokoj pokoj2 = new Pokoj(1,
                1000, true,
                true);
        Pokoj pokoj3 = new Pokoj(3,
                2400, false,
                false);
        Bookingmanager bookingmanger = new Bookingmanager();
        Guest karl = new Guest("Karel Dvorak", LocalDate.of(1990, 5, 15));
        bookingmanger.addGuest(karl);
        Guest kaja = new Guest("Karolina tmava", LocalDate.of(1993, 3, 13));
        bookingmanger.addGuest(kaja);
        Guest karl2 = new Guest("Karel Dvorak", LocalDate.of(1979, 1, 3));
        bookingmanger.addGuest(karl2);

        Booking numeroUno = new Booking(karl, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), pokoj3, 0, false);
        bookingmanger.addBooking(numeroUno);
        Booking numeroDos = new Booking(karl2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), pokoj2, 1, false);
        bookingmanger.addBooking(numeroDos);

        for (int i = 0; i < 10;i++) {
            Booking book = new Booking(kaja, LocalDate.of(2023, 8, 1 + i), LocalDate.of(2023, 8, 2 + i), pokoj2, 0, true);
            bookingmanger.addBooking(book);
        }
        System.out.println(bookingmanger.getbookings());
        System.out.println(bookingmanger.getAverageGuests());
        System.out.println(bookingmanger.getNumberOfWorkingBookings());
        System.out.println(bookingmanger.boookingsWith1Guest());
        bookingmanger.clearbookings();
        System.out.println(bookingmanger.getbookings());
    }
    public static void main(String[] args) {
        fillBookings();
    }

}

