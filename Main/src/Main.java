import java.util.Scanner;

public class Main {
    String name;
    int age;


    public static void main(String[] args) {
        int retirement = 67;
        int result;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please type your name");
        String name = myObj.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Please type your age");
        int age = myObj.nextInt();
        System.out.println("Age: " + age);
        result = retirement - age;
        if (age >= retirement) {
            System.out.println("You are retired");
        }else{
            System.out.println("you can retire in about " + result + " years");
        }
    }
}
