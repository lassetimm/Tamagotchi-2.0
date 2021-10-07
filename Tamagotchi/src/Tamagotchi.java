import java.util.Scanner;
import java.util.Random;
public class Tamagotchi {
    static Scanner scanner = new Scanner(System.in);

    public String name;
    public int age;
    public String mood;
    public int energy;
    public int money;
    public int hunger;

    public Tamagotchi(String name, int age, String mood, int energy, int money, int hunger) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.money = money;
        this.hunger = hunger;
    }

    public void printSound(){
        System.out.println("Ding!");
    }

    public void roosterActivityPlay() {
        int roosterPlayOptions = 3;
        int randomNumber = getRandomNumber(roosterPlayOptions);
        String playMsgOne = this.name + " is running around in the yard";
        String playMsgTwo = "As you are playing with " + this.name + " he miraculously lays ann egg";
        String playMsgThree = "As you are playing with " + this.name + " he miraculously lays ann 'Golden' egg";
        String energyMsg = this.name + "s energy decreased by 3";
        String hungerMsg = this.name + "s hunger decreased by 2";

        switch (randomNumber) {
            case 1:
                System.out.println(playMsgOne);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                energy = energy - 3;
                hunger = hunger -2;
                break;
            case 2:
                System.out.println(playMsgTwo);
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                energy = energy - 3;
                hunger = hunger - 2;
            case 3:
                System.out.println(playMsgThree);
                System.out.println("You sold the egg for 5 moneys");
                System.out.println(energyMsg);
                System.out.println(hungerMsg);
                money = money + 5;
                energy = energy - 3;
                hunger = hunger - 2;
        }
    }

    public void monkeyActivityPlay() {
        int monkeyPlayOptions = 2;
        int randomNumber = getRandomNumber(monkeyPlayOptions);
        String playMsgOne = this.name + " is running to a tree and climbing it at incredible speed";
        String playMsgTwo = "You let " + this.name + " pick your hair\n" + this.name + " Gains 1 hunger";
        String energyMsg = this.name + "s energy decreased by 3";
        String hungerMsg = this.name + "s hunger decreased by 2";

        if (randomNumber == 1) {
            System.out.println(playMsgOne);
            System.out.println(energyMsg);
            System.out.println(hungerMsg);
            energy = energy - 3;
            hunger = hunger - 2;

        } else {
            System.out.println(playMsgTwo);
            System.out.println(energyMsg);
            System.out.println(hungerMsg);
            hunger = hunger + 1;
            energy = energy - 3;
            hunger = hunger - 2;
        }
    }

    //Hvis den hedder animal er det fordi jeg bruger den til begge dyr.
    public void animalActivityFeeding() {
        int animalFeedingOptions = 2;
        int randomNumber = getRandomNumber(animalFeedingOptions);

        String feedMsgOne = this.name + " is eating";
        String feedMsgTwo = this.name + " is refusing to eat";
        String energyMsg = this.name + "s energy decreased by 2";

        if (randomNumber == 1) {
            System.out.println(feedMsgOne);
            System.out.println(energyMsg);
            hunger = hunger + 5;
            energy = energy - 2;
        } else {
            System.out.println(feedMsgTwo);
            System.out.println(energyMsg);
            hunger = hunger - 1;
            energy = energy -2;
        }

    }

    public int getRandomNumber(int animalFeedingOptions){
        Random rand = new Random();
        int randomNumber = rand.nextInt(animalFeedingOptions);
        randomNumber += 1;
        return randomNumber;
    }

    //Hvis den hedder animal er det fordi jeg bruger den til begge dyr.
    public void soutAnimalActivityScreen(){
        String[] animalActivity = {"Play", "Feed", "Special", "Stats"};
        int[] animalActivityNumber = {1, 2, 3, 4};
        for (int i = 0; i < animalActivity.length; i++) {
            System.out.println(animalActivityNumber[i] + " " + animalActivity[i]);

        }
    }

}
