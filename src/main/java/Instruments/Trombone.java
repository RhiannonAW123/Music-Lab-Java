package Instruments;

public class Trombone extends Instrument{

    private TromboneType tromboneType;

    public Trombone(InstrumentType family, String material, String colour, int buyPrice, int sellPrice, TromboneType tromboneType) {
        super(family, material, colour, buyPrice, sellPrice);
        this.tromboneType = tromboneType;
    }

    public TromboneType getTromboneType(){
        return tromboneType;
    }
}
