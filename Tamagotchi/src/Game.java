import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String welcomeMSG = "Welcome player, please choose \"1\" for a Rooster as pet or choose \"2\" for a Monkey as pet.";
        System.out.println(welcomeMSG);
        boolean whileChecker = true;

        while(whileChecker) {
            int petChoosingInput;
            try {
                petChoosingInput = scanner.nextInt();
                if (petChoosingInput == 1) {
                    String roosterName = giveRoosterName();
                    Rooster rooster = new Rooster(roosterName,2,"Happy",10,false, 0, 5);
                    chooseActivityForRooster(rooster);
                    whileChecker = false;

                } else if (petChoosingInput == 2) {
                    String monkeyName = giveMonkeyName();
                    Monkey monkey = new Monkey(monkeyName,2,"Happy",10,false, 0, 5);
                    chooseActivityForMonkey(monkey);
                    whileChecker = false;

                } else {
                    System.out.println("You didnt take either \"1\" or \"2\" please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("You didnt type a number");
                scanner.next();
            }
        }

    }

    public static void chooseActivityForMonkey(Monkey monkey){
        String lineBreaker = "_________________________________________________\n";
        System.out.println("What activity do you want " + monkey.name + " to do?");
        monkey.soutAnimalActivityScreen();
        int activityNumberForAnimal = scanner.nextInt();



        switch (activityNumberForAnimal){
            case 1:
                System.out.println("You choose to play with " + monkey.name);
                monkey.monkeyActivityPlay();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
            case 2:
                System.out.println("You choose to feed " + monkey.name);
                monkey.animalActivityFeeding();
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);
            case 3:
                System.out.println("You choose special");
                System.out.println(lineBreaker);
                monkey.monkeyActivityStealing();

                chooseActivityForMonkey(monkey);
            case 4:
                System.out.println(monkey.toString());
                System.out.println(lineBreaker);

                chooseActivityForMonkey(monkey);

        }
    }

    public static void chooseActivityForRooster(Rooster rooster){
        String lineBreaker = "_________________________________________________\n";
        System.out.println("What activity do you want " + rooster.name + " to do?");
        rooster.soutAnimalActivityScreen();
        int activityNumberForAnimal = scanner.nextInt();

        switch (activityNumberForAnimal){
            case 1:
                System.out.println("You choose to play with " + rooster.name);
                rooster.roosterActivityPlay();
                System.out.println(lineBreaker);

                chooseActivityForRooster(rooster);
            case 2:
                System.out.println("You choose to feed " + rooster.name);
                rooster.animalActivityFeeding();
                System.out.println(lineBreaker);

                chooseActivityForRooster(rooster);
            case 3:
                System.out.println("You choose special");
                System.out.println(lineBreaker);

                chooseActivityForRooster(rooster);
            case 4:
                System.out.println(rooster.toString());
                System.out.println(lineBreaker);

                chooseActivityForRooster(rooster);

        }
    }

    public static String giveRoosterName() {
        System.out.println("You choose Rooster\nWhat would you like to call it?");
        String roosterName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return roosterName;
    }

    public static String giveMonkeyName() {
        System.out.println("You choose Monkey\nWhat would you like to call it?");
        String monkeyName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return monkeyName;
    }

}
