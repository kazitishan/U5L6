import java.util.Scanner;

public class BankApp {
    private String name;
    private String pin;
    private String shopName;
    private int inventory;
    private int bagelPrice;
    private Bank bank;
    private CreditCard card;
    private CreditCard card2;
    private BagelShop shop;

    public BankApp(String name, String pin, String shopName, int inventory, int bagelPrice){
        this.name = name;
        this.pin = pin;
        this.shopName = shopName;
        this.inventory = inventory;
        this.bagelPrice = bagelPrice;
        Bank bank = new Bank();
        CreditCard card = new CreditCard(name, pin);
        BagelShop shop = new BagelShop(name, inventory, bagelPrice, bank);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getBagelPrice() {
        return bagelPrice;
    }

    public void setBagelPrice(int bagelPrice) {
        this.bagelPrice = bagelPrice;
    }

    public String menu(){
        String menu =  "What would you like to do...\n1. Purchase a bagel\n2. Return a bagel\n3. Make a payment on the credit card\n4. ";
        if (card2.getAccountHolder().equals(null)) menu += "Open a second credit card\n";
        else menu += "Choose card 1 or card 2 for a purchase/return/payment\n";
        menu += "5. Compare credit card balances\n6. Deposit profits into the bank as the bagel shop owner\n7. Check inventory as the bagel shop owner\n8. Quit";
        return menu;
    }

    public void menuChoice1(){
        
    }

}
