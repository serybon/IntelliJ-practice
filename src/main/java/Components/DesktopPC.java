package Components;

public class DesktopPC {
    Tower currentTower;
    Monitor currentMonitor;
    Mouse currentMouse;
    Keyboard currentKeyboard;
    double pcPrice;
    double computerAssembly;


    public DesktopPC(Tower tower, Monitor monitor, Mouse mouse, Keyboard keyboard, double computerAssemblyPrice ){
        currentTower = tower;
        currentMonitor = monitor;
        currentMouse = mouse;
        currentKeyboard = keyboard;
        computerAssembly = computerAssemblyPrice;
        pcPrice = tower.price + monitor.price+ mouse.price+ keyboard.price+computerAssemblyPrice;
    }
    public void showInfoAboutPC(){
        System.out.println("This computer assembly consists of the following components: ");
        currentTower.showInfo();
        currentMonitor.showInfo();
        currentMouse.showInfo();
        currentKeyboard.showInfo();
        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", pcPrice);
        System.out.println("\n==================================================================");
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
}
