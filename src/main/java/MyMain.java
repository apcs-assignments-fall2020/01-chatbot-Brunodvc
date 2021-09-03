import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello "+ name + "!");

        System.out.println("What is your favorite color?");
        String color = scan.nextLine();
        System.out.println(color + " is a cool color");

        System.out.println("What is your favorite number?");
        String number = scan.nextLine();
        int realnum = Integer.parseInt(number);
        System.out.println(realnum + " is a cool number, but mine is better because it's twice as big, its " + realnum*2);

        System.out.println("whats your imaginary dogs name?");
        String dog = scan.nextLine();
        System.out.println(dog + " is a cool name, but mine is better cause its better"+dog);

        System.out.println("What is the color of the sky");
        String sky = scan.nextLine();
        System.out.println("the sky really is "+ sky + " isn't it?");

        // Add some code here!

        scan.close();
    }
}
