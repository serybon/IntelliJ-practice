package Components;

import java.util.Scanner;

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
        System.out.println("Tower has been successfully created.");
    }

    public static Tower CreateNewTower() {
        System.out.println("Inputting Tower characteristics.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tower vendor: ");
        String vendor = scanner.next();
        System.out.print("Tower model: ");
        String model = scanner.next();
        System.out.print("RAM memory size: ");
        int ramMemorySize = (int) scanner.nextDouble();
        System.out.print("Graphic card: ");
        String graphicsCard = scanner.next();
        System.out.print("Operation system: ");
        String operationSystem = scanner.next();
        System.out.print("Tower price: ");
        double price = scanner.nextDouble();
        return new Tower(vendor,model,ramMemorySize,graphicsCard,operationSystem,price);
    }

    @Override
    public void showInfo() {
        System.out.printf("\n=================%s====================\n", this.getClass().getName().toUpperCase());
        System.out.printf("""
                Information about Tower:
                Vendor: %s
                Model: %s
                Ram memory size: %d
                Graphics Card: %s
                Operation System: %s
                Price: %.2f$""", vendor, model, ramMemorySize, graphicsCard, operationSystem, price);
    }

    @Override
    public String getInfo() {
        String title = String.format("\n=================%s====================read=from=file\n", this.getClass().getName().toUpperCase());
        return title + String.format("""
                Information about Tower:
                Vendor: %s
                Model: %s
                Ram memory size: %d
                Graphics Card: %s
                Operation System: %s
                Price: %.2f$""", vendor, model, ramMemorySize, graphicsCard, operationSystem, price);
    }
}


