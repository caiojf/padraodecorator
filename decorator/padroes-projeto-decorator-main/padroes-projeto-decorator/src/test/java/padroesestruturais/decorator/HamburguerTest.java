package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguer() {
        Hamburguer hamburguer = new Hamburguers(10);

        assertEquals(10, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoDoXburguer() {
        Hamburguer hamburguer = new Xburguer(new Hamburguers(10));

        assertEquals(12, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoDoXbacon() {
        Hamburguer hamburguer = new Xbacon(new Hamburguers(10));

        assertEquals(14, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoXburguermaisXbacon() {
        Hamburguer hamburguer = new Xburguer(new Xbacon (new Hamburguers(10)));


        assertEquals( 16, hamburguer.getPreco());
    }


    @Test
    void deveRetornarCustomHamburguer() {
        Hamburguer hamburguer = new Hamburguers();

        assertEquals("Hamburguer", hamburguer.getCustom());
    }

    @Test
    void deveRetornarCustomXburguer() {
        Hamburguer hamburguer = new Xburguer(new Hamburguers());

        assertEquals("Hamburguer/Xburguer", hamburguer.getCustom());
    }

    @Test
    void deveRetornarCustomXbacon() {
        Hamburguer hamburguer = new Xbacon(new Hamburguers());

        assertEquals("Hamburguer/Xbacon", hamburguer.getCustom());
    }

    @Test
    void deveRetornarCustomDeXburguermaisXbacon() {
        Hamburguer hamburguer = new Xburguer(new Xbacon (new Hamburguers()));


        assertEquals( "Hamburguers/Xburguer/Xbacon", hamburguer.getCustom());
    }


}