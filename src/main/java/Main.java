import Components.*;

public class Main {
    public static void main(String[] args) {

        Tower tower = new Tower("Dell", "OptiPlex 7010", 32, "Intel UHD Graphics 770", "Windows 11", 239.99);
        Monitor monitor = new Monitor("SAMSUNG", "Odyssey G4 LS27BG400EIXCI",27, 144, "FullHD", 119.99);
        Mouse mouse = new Mouse("Logitech", "G102",6, "wired", 28.95);
        Keyboard keyboard = new Keyboard("Corsair", "ML234","Membrane", "Wired", 39.99);

        DesktopPC newPC = new DesktopPC(tower, monitor, mouse, keyboard, 60);
        newPC.showInfoAboutPC();
        DesktopPC.addUpShowInfo(tower, monitor, keyboard, mouse);
    }
}