package Instruments;

public class Piano extends Instrument{

    private PianoType pianoType;

    public Piano(InstrumentType family, String material, String colour, int buyPrice, int sellPrice, PianoType pianoType) {
        super(family, material, colour, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}

