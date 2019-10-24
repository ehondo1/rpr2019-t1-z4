package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa kupljeno=new Korpa();
        for(int i=0;i<10;i++) {
            Artikl artikl=new Artikl("Jana",1,"10AA1");
            kupljeno.dodajArtikl(artikl);
        }
        assertEquals(10,kupljeno.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
    }

    @Test
    void setArtikli() {
    }
}