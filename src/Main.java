import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("I was cloned!");

        System.out.print("What's your name? Type it here:");
        String name = s.next();

        //Print Message with Name
        System.out.println("It's nice to meet you, " + name);
        System.out.println("I miss the real world, " + name);
    }
}
