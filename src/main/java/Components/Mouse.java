package Components;

public class Mouse extends Component implements InfoPriceProvider {

    int quantityOfButtons;
    String typeOfMouse;//wired/wireless


    public Mouse(String vendor, String model, int quantityOfButtons, String typeOfMouse, double price) {
        this.vendor = vendor;
        this.model = model;
        this.quantityOfButtons = quantityOfButtons;
        this.typeOfMouse = typeOfMouse;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Mouse:
                Vendor: %s
                Model: %s
                Quantity of buttons: %d
                Type of the mouse: %s
                Price: %.2f$
                """, vendor, model, quantityOfButtons, typeOfMouse, price);
    }

    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file", this.getClass().getName().toUpperCase());
        return title + String.format("""
                Information about Mouse:
                Vendor: %s
                Model: %s
                Quantity of buttons: %d
                Type of the mouse: %s
                Price: %.2f$
                """, vendor, model, quantityOfButtons, typeOfMouse, price);
    }
}
