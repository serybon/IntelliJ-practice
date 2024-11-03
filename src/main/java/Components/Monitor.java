package Components;

import java.util.Scanner;

public class Monitor extends Component implements InfoPriceProvider {

    int monitorSize;
    int refreshRate;//60/100/144/240
    String resolutionStandard;//HD/FHD/QHD/4K

    public Monitor(String vendor, String model, int monitorSize, int refreshRate, String resolutionStandard, double price) {
        this.vendor = vendor;
        this.model = model;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
        this.resolutionStandard = resolutionStandard;
        this.price = price;
        System.out.println("Monitor has been successfully created.");
    }

    public static Monitor CreateNewMonitor() {
        System.out.println("Inputting Monitor characteristics.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Monitor vendor: ");
        String vendor = scanner.next();
        System.out.println("Monitor model: ");
        String model = scanner.next();
        System.out.println("Monitor size: ");
        int monitorSize = scanner.nextInt();
        System.out.println("Refresh rate [60/100/144/240]: ");
        int refreshRate = scanner.nextInt();
        System.out.println("Resolution standard [HD/Full HD/QHD/4K UHD/5K]: ");
        String resolutionStandard = scanner.next();
        System.out.println("Monitor price: ");
        double price = scanner.nextDouble();
        return new Monitor(vendor, model,monitorSize,refreshRate,resolutionStandard, price);
    }

    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================\n", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Monitor:
                Vendor: %s
                Model: %s
                Components.Monitor size: %d
                Refresh Rate: %d
                Resolution Standard: %s
                Price: %.2f$""", vendor, model, monitorSize, refreshRate, resolutionStandard, price);
    }

    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file\n", this.getClass().getName().toUpperCase());
        return title + String.format("""
                Information about Monitor:
                Vendor: %s
                Model: %s
                Components.Monitor size: %d
                Refresh Rate: %d
                Resolution Standard: %s
                Price: %.2f$""", vendor, model, monitorSize, refreshRate, resolutionStandard, price);
    }
}

