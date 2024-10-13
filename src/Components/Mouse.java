package Components;

public class Mouse extends  Component implements InfoPriceProvider {

    int quantityOfButtons;
    String typeOfMouse;//wired/wireless


    public Mouse(String vendor, String model, int quantityOfButtons, String typeOfMouse , double price){
        this.vendor = vendor;
        this.model = model;
        this.quantityOfButtons = quantityOfButtons;
        this.typeOfMouse = typeOfMouse;
        this.price = price;
    }
    public void showInfo(){
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Components.Mouse: \nVendor: %s\nModel: %s\nQuantity of buttons: %d" +
                "\nType of the mouse: %s\nPrice: %.2f$", vendor,model,quantityOfButtons,typeOfMouse, price);
    }
}
