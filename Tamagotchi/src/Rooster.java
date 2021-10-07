public class Rooster extends Tamagotchi {
        public boolean crowing;

    public Rooster(String name, int age, String mood, int energy, boolean crowing, int money, int hunger) {
        super(name, age, mood, energy, money, hunger);
        this.crowing = crowing;
    }

    @Override
    public String toString() {
        return "Rooster{" +
                " Name = '" + name + '\'' +
                " , Age = " + age +
                " , Mood = '" + mood + '\'' +
                " , Energy = " + energy +
                " , Money = " + money +
                " , Hunger = " + hunger +
                " } ";
    }
}
