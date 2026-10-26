import java.util.Scanner;

public class him5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello, my " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Next year, you will be " + (age + 1) + ".");

        input.close();
    }
}
