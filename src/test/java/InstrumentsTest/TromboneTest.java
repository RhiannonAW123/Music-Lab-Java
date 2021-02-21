package InstrumentsTest;

import Instruments.InstrumentType;
import Instruments.Trombone;
import Instruments.TromboneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone(InstrumentType.BRASS, "Brass","Gold", 120, 190, TromboneType.BASE);
    }

    @Test
    public void tromboneHasType(){
        assertEquals(TromboneType.BASE, trombone.getTromboneType());
    }

    @Test
    public void markupCanBeCalculated(){
        assertEquals(70, trombone.calculateMarkup());
    }
}

