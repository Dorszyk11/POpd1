package z2;

public class Pies implements Zwierze, ImienneZwierze {
    private int wiek;
    private String imie;

    public Pies(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public int getIleNog() {
        return 4;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public String dajGlos() {
        return "Hau hau";
    }
}
