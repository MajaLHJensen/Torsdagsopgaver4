import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    static ArrayList<String> coffeeMenu = new ArrayList<String>();

    static void loadMenuData() {
        File file = new File("coffee.txt");
        System.out.println(file.getAbsoluteFile());
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }

        }catch(FileNotFoundException e){

            System.out.println("File not found. Check path and filename");

        }
        for(String coffee: coffeeMenu)
        {
            System.out.println(coffee);
        }
        }
}

