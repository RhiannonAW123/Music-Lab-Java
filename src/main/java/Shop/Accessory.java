package Shop;

import Behaviours.ISell;

public class Accessory implements ISell {

    private String accName;
    private int buyPrice;
    private int sellPrice;

    public Accessory(String accName, int buyPrice, int sellPrice) {
        this.accName = accName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
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

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
