import java.util.Scanner;
import java.util.concurrent.*;

public class Mars{
    public static void main(String[] args){

        System.out.println("The game is booting up!");

        long timeDelay = 5L;

        TimeUnit time = TimeUnit.SECONDS;

        for (int i = 5; i > 0; i--) {
            try {

            time.sleep(timeDelay);

            System.out.println("...");

        } catch (InterruptedException e) {

            System.out.println("test");
            }
        }

        System.out.println("* GAME START *");

        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");

        String name = input.nextLine();
        System.out.println("Hello " + name + ", welcome to the game!");

        System.out.println("Are you excited for the game, yes or no?");

        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Thats awesome. Let's begin.");
        } else if (response.equalsIgnoreCase("no")) {
            System.out.println("Well too bad. Here we go!");
        } else {
            System.out.println("You didn't answer correctly, but that's okay. :-) Here we go...");
        }

        System.out.println("How many suitcases do plan to bring?");
        int suitcases = input.nextInt();
        input.nextLine();
        if (suitcases == 2) {
            System.out.println("That's perfect!");
        } else if (suitcases > 2) {
            System.out.println("That's too many..." + "...");
        } else if (suitcases < 2) {
            System.out.println("Wow! How did you fit all your things?");
        }
        
        String line1 = "You're allowed to bring one companion animal with you.";
        String line2 = "What kind of companion animal would you like to bring?";
        String companionChoice = line1 + "\r\n" + line2;
        System.out.println(companionChoice);
        String companion = input.nextLine();

        System.out.println("What's your companion's name?");
        String companionName = input.nextLine();

        System.out.println("Cool! So you're bringing " + companionName + " the " + companion);

        System.out.println("NASA has a interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship.");
        
        System.out.println("Your options are:");
        System.out.println(" A Sleek, modern minimalism");
        System.out.println(" B Retro/vintage space age");
        System.out.println(" C SF Hippie chic");  
        System.out.println("Which decor would you like? Choose A, B, or C"); 

        String decor = input.nextLine();
        String decorName = "";
        if (decor.equalsIgnoreCase("A")) {
            decorName = "modern";
            System.out.println("You're going with the minimalist approach. Kudos to you. I like having things.");
        } else if (decor.equalsIgnoreCase("B")) {
            decorName = "retro/vintage";
            System.out.println("Ooooo how did you pull this off? You like the classics!");
        } else if (decor.equalsIgnoreCase("C")) {
            decorName = "hippie";
            System.out.println("Save the planet, let's save space...!");
        } else {
            decorName = "basic";
            System.out.println("You didn't choose a correct option. So we'll go with a basic style.");
        }

        System.out.println("You crawl into your " + decorName + " spaceship " + " with " + companionName);
        System.out.println("Brace for take off!");

        for (int i = 5; i > 0; i--) {
            try {

            time.sleep(timeDelay);

            System.out.println("...");

        } catch (InterruptedException e) {

            System.out.println("test");
            }
        }
        System.out.println("* LIFTOFF *");
    }
}