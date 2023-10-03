package hotelKotel;

import java.time.LocalDate;

public class klient {
    private String jmeno;

    private LocalDate datumnar;
    private LocalDate prijezd;
    private LocalDate odjezd;


    public klient(String jmeno, LocalDate datumnar, LocalDate prijezd, LocalDate odjezd) {
        this.jmeno = jmeno;
        this.prijezd = prijezd;
        this.odjezd = odjezd;
        this.datumnar = datumnar;

    }


    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getPrijezd() {
        return prijezd;
    }

    public void setPrijezd(LocalDate prijezd) {
        this.prijezd = prijezd;
    }

    public LocalDate getOdjezd() {
        return odjezd;
    }

    public void setOdjezd(LocalDate odjezd) {
        this.odjezd = odjezd;
    }

    public LocalDate getDatumnar() {
        return datumnar;
    }

    public void setDatumnar(LocalDate datumnar) {
        this.datumnar = datumnar;
    }
}




