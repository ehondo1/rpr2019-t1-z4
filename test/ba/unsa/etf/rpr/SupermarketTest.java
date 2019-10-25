package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket=new Supermarket();
        for(int i=0;i<1000;i++) {
            supermarket.dodajArtikl(new Artikl("Jana",1,"10A1"));
        }
        assertEquals(1000,supermarket.brojUbacenihArtikala());
    }

    @Test
    void izbaciArtiklSaPostojecimKodom() {
        Supermarket supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("Jana",1,"10"));
        for(int i=1;i<10;i++) {
            supermarket.dodajArtikl(new Artikl("Jana", 1, "10A1"));
        }
        Artikl izbaceni=supermarket.izbaciArtiklSaKodom("10");
        assertEquals("10",izbaceni.getKod());
    }

    @Test
    void izbaciAriklSaKodomKojiNePostoji() {
        Supermarket supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("Jana",1,"10"));
        for(int i=1;i<10;i++) {
            supermarket.dodajArtikl(new Artikl("Jana", 1, "10A1"));
        }
        Artikl izbaceni=supermarket.izbaciArtiklSaKodom("100");
        assertNull(izbaceni);
    }
    @Test
    void DodavanjeHiljaduPrvogArtikla() {
        Supermarket supermarket=new Supermarket();
        for(int i=0;i<1000;i++) {
            supermarket.dodajArtikl(new Artikl("Jana", 1, "10A1"));
        }
        assertEquals(1000,supermarket.brojUbacenihArtikala());
    }
}