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
    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================read=from=file", this.getClass().getName().toUpperCase());
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
        String title = String.format("\n=================%s====================", this.getClass().getName().toUpperCase());
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

