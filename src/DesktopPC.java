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
        pcPrice = tower.towerPrice + monitor.monitorPrice+ mouse.mousePrice+ keyboard.keyboardPrice+computerAssemblyPrice;
    }
    public void showInfoAboutPC(){
        System.out.println("This computer assembly consists of the following components: ");
        currentTower.showInfoAboutTower();
        currentMonitor.showInfoAboutMonitor();
        currentMouse.showInfoAboutMouse();
        currentKeyboard.showInfoAboutKeyboard();
        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", pcPrice);
        System.out.println("\n==================================================================");
    }
}
