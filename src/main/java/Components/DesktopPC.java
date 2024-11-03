package Components;

import Menu.FileOperation;

import java.util.Scanner;

public class DesktopPC {
    Tower currentTower;
    Monitor currentMonitor;
    Mouse currentMouse;
    Keyboard currentKeyboard;
    double pcPrice;
    double computerAssembly;


    public DesktopPC(Tower tower, Monitor monitor, Mouse mouse,
                     Keyboard keyboard, double computerAssemblyPrice) {
        currentTower = tower;
        currentMonitor = monitor;
        currentMouse = mouse;
        currentKeyboard = keyboard;
        computerAssembly = computerAssemblyPrice;
        pcPrice = tower.price + monitor.price + mouse.price + keyboard.price + computerAssemblyPrice;
    }

    public DesktopPC(String vendorTower, String modelTower, int ramMemorySize, String graphicsCard,
                     String operationSystem, double priceTower, String vendorMonitor, String modelMonitor,
                     int monitorSize, int refreshRate, String resolutionStandard, double priceMonitor, String vendorKeyboard,
                     String modelKeyboard, String switchTechnologyKeyboard, String typeOfKeyboard, double priceKeyboard,
                     String vendorMouse, String modelMose, int quantityOfButtonsMouse, String typeOfMouse, double priceMouse) {
        this.currentTower = new Tower(vendorTower, modelTower, ramMemorySize, graphicsCard, operationSystem, priceTower);
        this.currentMonitor = new Monitor(vendorMonitor, modelMonitor, monitorSize, refreshRate, resolutionStandard, priceMonitor);
        this.currentKeyboard = new Keyboard(vendorKeyboard, modelKeyboard, switchTechnologyKeyboard, typeOfKeyboard, priceKeyboard);
        this.currentMouse = new Mouse(vendorMouse, modelMose, quantityOfButtonsMouse, typeOfMouse, priceMouse);
        System.out.println("The computer instance has been created.");
    }

    public void showInfoAboutPC() {
        System.out.println("\nThis computer assembly consists of the following components: ");
        currentTower.showInfo();
        currentMonitor.showInfo();
        currentMouse.showInfo();
        currentKeyboard.showInfo();
        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", pcPrice);
        System.out.println("\n==================================================================");
    }

    public String getInfoAboutPC() {
        String allInfo = "This computer assembly consists of the following components==fromFile:\n " +
                currentTower.getInfo() +
                currentMonitor.getInfo() +
                currentMouse.getInfo() +
                currentKeyboard.getInfo() +
                "\n==========================FINAL PRICE=============================\n" +
                String.format("The total cost of assembling the computer is equal to - %.2f$", pcPrice) +
                "\n==================================================================";
        return allInfo;
    }

    public static void addUpShowInfo(InfoPriceProvider... components) {
        System.out.println("\nInformation about all components: ");

        double sumComponents = 0;
        for (InfoPriceProvider component : components) {
            component.showInfo();
            sumComponents += component.getPrice();

        }
        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", sumComponents);
        System.out.println("\n==================================================================");

    }

    public static DesktopPC CreatePcWithKnownSpecifications() {
        Tower tower = new Tower("Dell", "OptiPlex 7010", 32,
                "Intel UHD Graphics 770", "Windows 11", 239.99);
        Monitor monitor = new Monitor("SAMSUNG", "Odyssey G4 LS27BG400EIXCI",
                27, 144, "FullHD", 119.99);
        Mouse mouse = new Mouse("Logitech", "G102", 6, "wired", 28.95);
        Keyboard keyboard = new Keyboard("Corsair", "ML234", "Membrane",
                "Wired", 39.99);

        return new DesktopPC(tower, monitor, mouse, keyboard, 60);
    }

    public static DesktopPC CreateNewDesktopPC() {
        System.out.println("You have selected the Create a new computer option");

        Tower newTower = Tower.CreateNewTower();
        Monitor newMonitor = Monitor.CreateNewMonitor();
        Keyboard newKeyboard =  Keyboard.CreateNewKeyboard();
        Mouse newMouse = Mouse.CreateNewMouse();
        System.out.println("Assembly cost: ");
        Scanner scanner = new Scanner(System.in);
        double assemblyPrice = scanner.nextDouble();
        DesktopPC newDesktopPC = new DesktopPC(newTower,newMonitor,newMouse,newKeyboard,assemblyPrice);
        FileOperation.WriteToFile(newDesktopPC);
        return newDesktopPC;
    }

}
