package Components;

public class Tower extends Component implements InfoPriceProvider {

    int ramMemorySize;
    String graphicsCard;
    String operationSystem;

    public Tower(String vendor, String model, int ramMemorySize, String graphicsCard, String operationSystem, double price) {
        this.vendor = vendor;
        this.model = model;
        this.ramMemorySize = ramMemorySize;
        this.graphicsCard = graphicsCard;
        this.operationSystem = operationSystem;
        this.price = price;
    }

    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Tower: \nVendor: %s\nModel: %s" +
                        "\nRam memory size: %d\nGraphics Card: %s\nOperation System: %s\nPrice: %.2f$", vendor,
                model, ramMemorySize, graphicsCard, operationSystem, price);
    }
}


