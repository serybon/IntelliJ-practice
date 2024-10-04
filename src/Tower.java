public class Tower {
    String brandTower;
    String modelNameTower;
    int ramMemorySize;
    String graphicsCard;
    String operationSystem;
    double towerPrice;

    public Tower(String brandTower, String modelNameTower, int ramMemorySize, String graphicsCard, String operationSystem, double towerPrice) {
        this.brandTower = brandTower;
        this.modelNameTower = modelNameTower;
        this.ramMemorySize = ramMemorySize;
        this.graphicsCard = graphicsCard;
        this.operationSystem = operationSystem;
        this.towerPrice = towerPrice;
    }

    public void showInfoAboutTower() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about Tower: \nBrand of Tower: %s\nName of the model: %s" +
                "\nRam memory size: %d\nGraphics Card: %s\nOperation System: %s\nPrice: %.2f$", brandTower,
                modelNameTower, ramMemorySize, graphicsCard, operationSystem, towerPrice);
    }
}


