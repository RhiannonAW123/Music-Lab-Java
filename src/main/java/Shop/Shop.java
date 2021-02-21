package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock(){
        return this.stock;
    }


    public void addProductToStock(ISell product){
        this.stock.add(product);
    }

    public void removeProductFromStock(ISell product){
        this.stock.remove(product);
    }

    public int getStockCount(){
        return this.stock.size();
    }




}
