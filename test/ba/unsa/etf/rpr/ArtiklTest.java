package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        //ocekivana i stvarna vrijednost
        assertEquals("Jana",artikl.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        assertEquals(1,artikl.getCijena());
    }

    @Test
    void getKod() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        assertEquals("10A1",artikl.getKod());
    }

    @Test
    void setNaziv() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        artikl.setNaziv("Studena");
        assertEquals("Studena",artikl.getNaziv());
    }

    @Test
    void setCijena() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        artikl.setCijena(2);
        assertEquals(2,artikl.getCijena());
    }

    @Test
    void setKod() {
        Artikl artikl=new Artikl("Jana",1,"10A1");
        artikl.setKod("10AA1");
        assertEquals("10AA1",artikl.getKod());
    }
}