package InstrumentsTest;

import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Blonde", 70, 100, 6, GuitarType.SEMIACOUSTIC);
    }

    @Test
    public void instrumentHasType(){
        assertEquals(InstrumentType.STRINGS, guitar.getFamily() );
    }

    @Test
    public void instrumentHasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void instrumentHasColour(){
        assertEquals("Blonde", guitar.getColour());
    }

    @Test
    public void instrumentHasBuyPrice(){
        assertEquals(70, guitar.getBuyPrice());
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(100, guitar.getSellPrice());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }


    @Test
    public void hasType(){
        assertEquals(GuitarType.SEMIACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void instrumentCanBeMaintained(){
        assertEquals("The instrument needs cleaning", guitar.maintain());
    }

    @Test
    public void instrumentCanBeTuned(){
        assertEquals("Instrument needs tuned", guitar.tuneInstrument());
    }

    @Test
    public void instrumentCanBePlayed(){
        assertEquals("Play Music", guitar.play());
    }

    @Test
    public void markupCanBeCalculated(){
        assertEquals(30, guitar.calculateMarkup());
    }


}
