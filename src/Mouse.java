public class Mouse {
    String mouseVendor;
    int quantityOfButtons;
    String typeOfMouse;//wired/wireless
    double mousePrice;

    public Mouse(String mouseVendor, int quantityOfButtons, String typeOfMouse , double mousePrice){
        this.mouseVendor = mouseVendor;
        this.quantityOfButtons = quantityOfButtons;
        this.typeOfMouse = typeOfMouse;
        this.mousePrice = mousePrice;
    }
    public void showInfoAboutMouse(){
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Mouse: \nVendor: %s\nQuantity of buttons: %d" +
                "\nType of the mouse: %s\nPrice: %.2f$", mouseVendor,quantityOfButtons,typeOfMouse, mousePrice);
    }
}
