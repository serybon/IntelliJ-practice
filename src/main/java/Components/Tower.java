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
    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("""
                        Information about Tower:
                        Vendor: %s
                        Model: %s
                        Ram memory size: %d
                        Graphics Card: %s
                        Operation System: %s
                        Price: %.2f$""", vendor,model, ramMemorySize, graphicsCard, operationSystem, price);
    }
    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file", this.getClass().getName().toUpperCase());
        return title + String.format("""
                        Information about Tower:
                        Vendor: %s
                        Model: %s
                        Ram memory size: %d
                        Graphics Card: %s
                        Operation System: %s
                        Price: %.2f$""", vendor,model, ramMemorySize, graphicsCard, operationSystem, price);
    }
}


