


public class Main {
    public static void main(String[] args) {

        Tower tower = new Tower("Dell", "OptiPlex 7010", 32, "Intel UHD Graphics 770", "Windows 11", 239.99);
        Monitor monitor = new Monitor("SAMSUNG", 27, 144, "FullHD", 119.99);
        Mouse mouse = new Mouse("Logitech", 6, "wired", 28.95);
        Keyboard keyboard = new Keyboard("Corsair", "Membrane", "Wired", 39.99);

        DesktopPC newPC = new DesktopPC(tower, monitor, mouse, keyboard, 60);
        newPC.showInfoAboutPC();
    }
}