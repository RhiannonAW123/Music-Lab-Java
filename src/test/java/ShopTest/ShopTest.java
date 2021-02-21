package ShopTest;


import Instruments.*;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    Piano piano;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano(InstrumentType.PERCUSSION, "Wood", "White", 500, 700, PianoType.GRAND);
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Blonde", 60, 90,6, GuitarType.ACOUSTIC);

    }

    @Test
    public void hasStock(){
        assertNotNull(shop.getStock());
    }

    @Test
    public void canAddProductToStock(){
        shop.addProductToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveProductFromStock(){
        shop.addProductToStock(guitar);
        shop.addProductToStock(piano);
        shop.addProductToStock(piano);
        shop.removeProductFromStock(piano);
        assertEquals(2, shop.getStockCount());
    }
}
