package Components;

public class Monitor extends Component implements InfoPriceProvider{

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
    }

    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Components.Monitor: \nVendor: %s\nModel: %s\nComponents.Monitor size: %d\nRefresh Rate: %d" +
                "\nResolution Standard: %s\nPrice: %.2f$", vendor, model, monitorSize, refreshRate, resolutionStandard, price);
    }
}

