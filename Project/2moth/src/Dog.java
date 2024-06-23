import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands, Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public Dog(String name, String breed, Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommand() {
        return commands;
    }

    public void setCommand(String[] command) {
        this.commands = command;
    }
    public void makeVoice(){
        System.out.println("Гав Гав");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String toString() {
        if (commands != null) {
            return super.toString() + ", Name= " + name + '\'' +
                    ", Breed='" + breed + '\'' +
                    ", Command=" + Arrays.toString(commands);
        } else {
            return super.toString() + ", Name= " + name + '\'' +
                    ", Breed='" + breed + '\'';
        }
    }
}