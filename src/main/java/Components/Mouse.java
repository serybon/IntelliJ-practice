package Components;

import java.util.Scanner;

public class Mouse extends Component implements InfoPriceProvider {

    int quantityOfButtons;
    String typeOfMouse;//wired/wireless

    public Mouse(String vendor, String model, int quantityOfButtons, String typeOfMouse, double price) {
        this.vendor = vendor;
        this.model = model;
        this.quantityOfButtons = quantityOfButtons;
        this.typeOfMouse = typeOfMouse;
        this.price = price;
        System.out.println("Mouse has been successfully created.");
    }
    public Mouse() {

    }

    public static Mouse CreateNewMouse() {
        System.out.println("Inputting Mouse characteristics.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mouse vendor: ");
        String vendor = scanner.next();
        System.out.println("Mouse model: ");
        String model = scanner.next();
        scanner.next();
        System.out.println("Quantity of buttons: ");
        int quantityButtons = Integer.parseInt(scanner.next());
        System.out.println("Mouse type [wired/wireless]: ");
        String typeOfMouse = scanner.next();
        System.out.println("Mouse price: ");
        double price = scanner.nextDouble();
        return new Mouse(vendor, model, quantityButtons, typeOfMouse, price);
    }

    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================\n", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Mouse:
                Vendor: %s
                Model: %s
                Quantity of buttons: %d
                Type of the mouse: %s
                Price: %.2f$""", vendor, model, quantityOfButtons, typeOfMouse, price);
    }

    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file\n", this.getClass().getName().toUpperCase());
        return title + String.format("""
                Information about Mouse:
                Vendor: %s
                Model: %s
                Quantity of buttons: %d
                Type of the mouse: %s
                Price: %.2f$""", vendor, model, quantityOfButtons, typeOfMouse, price);
    }
}
