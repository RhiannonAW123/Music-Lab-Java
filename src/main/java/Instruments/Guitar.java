package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(InstrumentType family, String material, String colour, int buyPrice, int sellPrice, int numberOfStrings, GuitarType guitarType) {
        super(family, material, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public GuitarType getGuitarType(){
        return guitarType;
    }


}
