import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws InterruptedException {
        System.out.println("Enter your name to turn into a catgirl, nyaaa!");

        Scanner catgirlScanner = new Scanner(System.in);

        String input = catgirlScanner.nextLine();

        catgirl(input);


    }

    public static void catgirl(String name) throws InterruptedException {

        int oben = 110;
        int unten = 0;

        System.out.println("Catgirl-ing initialized. Please Wait.");

        Random rn = new Random();

        while (unten < oben) {

            unten = rn.nextInt(unten, oben + 1);

            Thread.sleep(rn.nextInt(1000, 8000));

            System.out.println("" + unten + "%");

        }

        System.out.println("Nyammy! Youre a catgrill now, " + name + "!");

    }

}
