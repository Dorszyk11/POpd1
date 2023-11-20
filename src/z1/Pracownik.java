package z1;

public class Pracownik {
    private Pracownik przelozony;
    private int pensja;

    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public Pracownik(Pracownik przelozony) {
        this.przelozony = przelozony;
        this.pensja = 3600;
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }
}
