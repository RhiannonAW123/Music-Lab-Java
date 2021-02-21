package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType family;
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(InstrumentType family, String material, String colour, int buyPrice, int sellPrice) {
        this.family = family;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentType getFamily() {
        return family;
    }

    public void setFamily(String type) {
        this.family = family;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String maintain(){
        return "The instrument needs cleaning";
    }

    public String tuneInstrument(){
        return "Instrument needs tuned";
    }

    public String play(){
        return "Play Music";
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
