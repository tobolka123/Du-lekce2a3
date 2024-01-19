package hotelKotel;

import java.time.LocalDate;

public class Guest {
    String jmeno;
    LocalDate datumnar;

    public Guest(String jmeno, LocalDate datumnar) {
        this.jmeno = jmeno;
        this.datumnar = datumnar;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumnar() {
        return datumnar;
    }

    public void setDatumnar(LocalDate datumnar) {
        this.datumnar = datumnar;
    }
}
