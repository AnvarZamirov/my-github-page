public class Main {

    public static void main(String[] args) {

        Father objectA = new Father(50, "Father", new ComplexType("Father's complex field"), ComplexEnum.TYPE1);

        System.out.println("ObjectA:");
        objectA.displayInfo();
        objectA.displayInfo("Prefix: ");
        objectA.displayFullInfo();

        Son objectB = new Son(25, "Son", new ComplexType("Son's complex field"), ComplexEnum.TYPE2, "Reading");

        System.out.println("\nObjectB:");
        objectB.displayInfo();
        objectB.displayInfo("Prefix: ");
        objectB.displayFullInfo();

        Son objectC = new Son(30, "Son2", new ComplexType("Son2's complex field"), ComplexEnum.TYPE3, "Gaming");

        System.out.println("\nObjectC:");
        objectC.displayInfo();
        objectC.displayInfo("Prefix: ");
        objectC.displayFullInfo();
    }
}
