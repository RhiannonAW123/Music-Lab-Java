package InstrumentsTest;

import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.PERCUSSION,"Wood","Blue", 500,600, PianoType.GRAND);
    }

    @Test
    public void pianoHasType(){
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void markupCanBeCalculated(){
        assertEquals(100, piano.calculateMarkup());
    }
}
