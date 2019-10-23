package ba.unsa.etf.rpr;

public class Korpa {
    private final int maxBrArtikala=50;
    private int kupljeno=0;
    private Artikl[] kupljeniProizvodi=new Artikl[maxBrArtikala];

    public boolean dodajArtikl(Artikl proizvod) {
        if(kupljeno<maxBrArtikala) {
            kupljeniProizvodi[kupljeno]=proizvod;
            kupljeno++;
            return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
            Artikl izbaceniArtikl=null;
            for(int i=0;i<kupljeno;i++) {
                izbaceniArtikl=kupljeniProizvodi[i];
                if(kupljeniProizvodi[i].getKod().equals(kod)) {
                    for(int j=i;j<kupljeno-1;j++)
                        kupljeniProizvodi[j]=kupljeniProizvodi[j+1];
                    kupljeno--;
                    i--;
                }
            }
            return izbaceniArtikl;
    }
    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<kupljeno;i++)
            suma=suma+kupljeniProizvodi[i].getCijena();
        return suma;
    }
    public Artikl[] getArtikli() {
        return kupljeniProizvodi;
    }
    public void setArtikli(Artikl[] artikli) { this.kupljeniProizvodi=artikli;}

}
