public class Main {
    public static void main(String[] args) {
        String[] commands = { "Sit" , "Run" };

        Shelter shelter = new Shelter("Peace" , "Lenina 1");

        final Dog dog = new Dog ("Rex" , "PitBull" , commands, shelter , ColorEnum.BROWN);
        System.out.println(dog);

        System.out.println("--------------------------------");

        Dog dog2 = new Dog("Bazz", "Haske", shelter , ColorEnum.BLACK);
        System.out.println(dog2);

        dog.makeVoice();
        dog.makeVoice("Гув Гув");

    }
}