package ba.unsa.etf.rpr;

public class Supermarket {
    private final int maxBrArtikala=1000;
    private Artikl[] artikli=new Artikl[maxBrArtikala];
    private int brArikala=0;

    public void dodajArtikl(Artikl artikal) {
        if(brArikala<maxBrArtikala)
        {
            artikli[brArikala]=artikal;
            brArikala++;
        }
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public void setAtikli(Artikl[] artikli) { this.artikli=artikli;}

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl proizvod=null;
        for(int i=0;i<brArikala;i++) {
            proizvod=artikli[i];
            if(artikli[i].getKod().equals(kod)) {
                for(int j=i;j<brArikala-1;j++)
                    artikli[j]=artikli[j+1];
                i--;
                brArikala--;
            }
        }
        return proizvod;
    }
}
