public class Monitor {
    String vendorMonitor;
    int monitorSize;
    int refreshRate;//60/100/144/240
    String resolutionStandard;//HD/FHD/QHD/4K
    double monitorPrice;

    public Monitor(String vendorMonitor,int monitorSize, int refreshRate, String resolutionStandard, double monitorPrice) {
        this.vendorMonitor = vendorMonitor;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
        this.resolutionStandard = resolutionStandard;
        this.monitorPrice = monitorPrice;
    }

    public void showInfoAboutMonitor() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Monitor: \nVendor: %s\nMonitor size: %d\nRefresh Rate: %d" +
                "\nResolution Standard: %s\nPrice: %.2f$", vendorMonitor, monitorSize, refreshRate, resolutionStandard, monitorPrice);
    }
}

