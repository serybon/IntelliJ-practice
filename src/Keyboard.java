public class Keyboard {
    String keyboardVendor;
    String switchTechnology;//membrane/mechanical/optical
    String typeOfKeyboard;//wired/wireless
    double keyboardPrice;

    public Keyboard(String keyboardVendor, String switchTechnology, String typeOfMouse, double keyboardPrice) {
        this.keyboardVendor = keyboardVendor;
        this.switchTechnology = switchTechnology;
        this.typeOfKeyboard = typeOfMouse;
        this.keyboardPrice = keyboardPrice;
    }

    public void showInfoAboutKeyboard() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Keyboard: \nVendor: %s\nSwitch technology: %s" +
                "\nType of the keyboard: %s\nPrice: %.2f$", keyboardVendor, switchTechnology, typeOfKeyboard, keyboardPrice);
    }
}
