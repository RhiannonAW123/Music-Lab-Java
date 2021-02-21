package ShopTest;

import Shop.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Guitar Strings", 12,15);
    }

    @Test
    public void hasAccType(){
        assertEquals("Guitar Strings", accessory.getAccName());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(12, accessory.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15, accessory.getSellPrice());
    }

    @Test
    public void canChangeAccName(){
       accessory.setAccName("Drum Sticks");
       assertEquals("Drum Sticks", accessory.getAccName());
    }

    @Test
    public void canChangeAccBuyPrice(){
        accessory.setBuyPrice(5);
        assertEquals(5, accessory.getBuyPrice());
    }

    @Test
    public void canChangeAccSellPrice(){
        accessory.setSellPrice(10);
        assertEquals(10, accessory.getSellPrice());
    }

    @Test
    public void canCalculateAccMarkup(){
        assertEquals(3, accessory.calculateMarkup());
    }
}
