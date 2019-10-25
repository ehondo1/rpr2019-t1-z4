package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

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
    void testDodavanja() {
        Korpa korpa=new Korpa();
        Artikl artikl=new Artikl("Jana",1,"10A1");
        boolean mozesedodati=korpa.dodajArtikl(artikl);
        assertTrue(mozesedodati);
    }

    @Test
    void daLiSeMozeDodatiPedesetPrviArtikl() {
        Korpa korpa=new Korpa();
        for(int i=0;i<50;i++) {
            korpa.dodajArtikl(new Artikl("Jana",1,"10A1"));
        }
        boolean moze = korpa.dodajArtikl(new Artikl("Jana",1,"10A1"));
        assertFalse(moze);
    }

    @Test
    void izbacivanjeTestSaPostojecimKodom() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Jana",2,"2"));
        for(int i=1;i<=10;i++) {
            korpa.dodajArtikl(new Artikl("Jana",1,"10A1"));
        }
        Artikl izbaceni=korpa.izbaciArtiklSaKodom("2");
        assertEquals("2",izbaceni.getKod());
    }

    @Test
    void izbacivanjeTestSaKodomKojiNePostoji() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Jana",2,"2"));
        for(int i=1;i<=10;i++) {
            korpa.dodajArtikl(new Artikl("Jana",1,"10A1"));
        }
        Artikl izbaceni=korpa.izbaciArtiklSaKodom("4");
        assertNull(izbaceni);

    }



}