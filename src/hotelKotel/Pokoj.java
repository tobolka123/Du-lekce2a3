package hotelKotel;

public class Pokoj {
    private int pocetLuzek;
    private int cenaNaNoc;
    private boolean balkon;
    private boolean vyhledNaMore;

    public Pokoj(int pocetLuzek, int cenaNaNoc, boolean balkon, boolean vyhledNaMore) {
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.cenaNaNoc = cenaNaNoc;
        this.vyhledNaMore = vyhledNaMore;

    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public int getCenaNaNoc() {
        return cenaNaNoc;
    }

    public void setCenaNaNoc(int cenaNaNoc) {
        this.cenaNaNoc = cenaNaNoc;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

}
