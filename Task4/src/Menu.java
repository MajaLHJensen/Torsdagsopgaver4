import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> options;

    public Menu(ArrayList<String> options)
    {
        this.options = options;
    }

public int ShowMenu()
{
    System.out.println("Type a number to choose");
    for(String option : options)
    {
        System.out.println(option);
    }
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    return choice;
}
}



