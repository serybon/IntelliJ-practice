import Components.*;

public class Main {
    public static void main(String[] args) {

        DesktopPC myDell = DesktopPC.CreatePcWithKnownSpecifications();
        myDell.showInfoAboutPC();
    }
}