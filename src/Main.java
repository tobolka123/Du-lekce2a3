import hotelKotel.pokoje;
import hotelKotel.klient;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        pokoje pokoj1 = new pokoje(1,
                1000, true,
                true);
        pokoje pokoj2 = new pokoje(1,
                1000, true,
                true);
        pokoje pokoj3 = new pokoje(3,
                2400, false,
                true);
        klient klient1 = new klient("Adela Malikova",
                LocalDate.of(1993, 3, 13),
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26));
        klient klient2 = new klient("Jan Dvoracek",
                LocalDate.of(1995, 5, 5),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14));

        int a = (klient1.getOdjezd().getDayOfYear() - klient1.getPrijezd().getDayOfYear()) * pokoj1.getCenaNaNoc();
        int b = (klient2.getOdjezd().getDayOfYear() - klient2.getPrijezd().getDayOfYear()) * pokoj3.getCenaNaNoc();

        String rezervace1 = klient1.getJmeno()+ " " + "(" + klient1.getDatumnar()+ ") " + a + "Kc";
        String rezervace2 = klient1.getJmeno()+ " " + "(" + klient1.getDatumnar()+ ") " + ", " +
                            klient2.getJmeno()+ " " + "(" + klient2.getDatumnar()+ ") " + b + "Kc";
        System.out.println(rezervace1);
        System.out.println(rezervace2);
    }
}