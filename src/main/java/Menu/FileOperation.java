package Menu;

import Components.DesktopPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {

    public static void WriteToFile(DesktopPC pc) {
        try {
            FileWriter fileWriter = new FileWriter("F:\\IntelliJ_source\\save.txt");
            fileWriter.append(pc.getInfoAboutPC());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Sorry, can't write to file. Full error message: " + e.getMessage());
        }
    }

    public static void ReadFromFile(){
        ArrayList<String> fileContent = new ArrayList<>();
        try {
            File file = new File("F:\\IntelliJ_source\\save.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                fileContent.add(scanner.nextLine());
            }
            fileContent.forEach(System.out::println);
        }catch (FileNotFoundException e){
            System.out.println("File not found. Full message: " + e.getMessage());
        }


    }
}
