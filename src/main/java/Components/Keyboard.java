package Components;

import java.util.Scanner;

public class Keyboard extends Component implements InfoPriceProvider {

    String switchTechnology;//membrane/mechanical/optical
    String typeOfKeyboard;//wired/wireless

    public Keyboard(String vendor, String model, String switchTechnology, String typeOfKeyboard, double price) {
        this.vendor = vendor;
        this.model = model;
        this.switchTechnology = switchTechnology;
        this.typeOfKeyboard = typeOfKeyboard;
        this.price = price;
        System.out.println("Keyboard has been successfully created.");
    }

    public static Keyboard CreateNewKeyboard() {
        System.out.println("Inputting Keyboard characteristics.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Keyboard vendor: ");
        String vendor = scanner.next();
        System.out.println("Keyboard model: ");
        String model = scanner.next();
        System.out.println("Switch technology [membrane/mechanical/optical]: ");
        String switchTechnology = scanner.next();
        System.out.println("Keyboard type [wired/wireless]: ");
        String typeOfKeyboard = scanner.next();
        System.out.println("Keyboard price: ");
        double price = scanner.nextDouble();

        return new Keyboard(vendor,model,switchTechnology,typeOfKeyboard,price);
    }

    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================\n", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Keyboard:
                Vendor: %s
                Model: %s
                Switch technology: %s
                Type of the keyboard: %s
                Price: %.2f$""", vendor, model, switchTechnology, typeOfKeyboard, price);
    }

    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file\n", this.getClass().getName().toUpperCase());
        return title + String.format("""
                Information about Keyboard:
                Vendor: %s
                Model: %s
                Switch technology: %s
                Type of the keyboard: %s
                Price: %.2f$""", vendor, model, switchTechnology, typeOfKeyboard, price);
    }
}
