package hotelKotel;

import java.time.LocalDate;

public class Booking {
    private LocalDate prijezd;
    private LocalDate odjezd;
    private int pocetdni;
    private int cena;
    private int otherGuests;
    private Guest mainGuest;
    private Pokoj pokoj;
    private boolean typeofvacation;

    public Booking(Guest guest, LocalDate prijezd, LocalDate odjezd, Pokoj pokoj, int otherGuests, boolean isworking) {
        this.mainGuest = guest;
        this.prijezd = prijezd;
        this.odjezd = odjezd;
        this.pokoj = pokoj;
        this.pocetdni = odjezd.getDayOfYear() - prijezd.getDayOfYear();
        this.cena = pokoj.getCenaNaNoc()*pocetdni;
        this.otherGuests = otherGuests;
        this.typeofvacation = isworking;
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

    public int getPocetdni() {
        return pocetdni;
    }

    public void setPocetdni(int pocetdni) {
        this.pocetdni = pocetdni;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean getTypeofvacation() {
        return typeofvacation;
    }

    public void setTypeofvacation(boolean typeofvacation) {
        this.typeofvacation = typeofvacation;
    }
    public int getotherguests() {
        return otherGuests;
    }
    public void setOtherGuests(int totGuests) {
        this.otherGuests = totGuests;
    }

    public int getTotalGuests() {
        return otherGuests + 1;
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }

    @Override
    public String toString() {
        int totalGuests = otherGuests + 1;
        String vyhled = "ne";
        if (pokoj.isVyhledNaMore()) {
            vyhled = "ano";
        }
        return prijezd + " az " + odjezd + " " + mainGuest.getJmeno() + " (" + mainGuest.getDatumnar() + ")[" + totalGuests + ", " +vyhled + "] za " + cena+ "kc";
    }
}
