package Components;

public class Keyboard extends Component implements InfoPriceProvider {

    String switchTechnology;//membrane/mechanical/optical
    String typeOfKeyboard;//wired/wireless

    public Keyboard(String vendor,String model, String switchTechnology, String typeOfMouse, double price) {
        this.vendor = vendor;
        this.model = model;
        this.switchTechnology = switchTechnology;
        this.typeOfKeyboard = typeOfMouse;
        this.price = price;
    }

    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Keyboard:
                Vendor: %s
                Model: %s
                Switch technology: %s
                Type of the keyboard: %s
                Price: %.2f$""", vendor, model, switchTechnology, typeOfKeyboard, price);
    }
}
