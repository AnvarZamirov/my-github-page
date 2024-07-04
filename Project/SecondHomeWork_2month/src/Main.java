public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Printable object1 = main.createObject("iPhone");

        Printable object2 = main.createObject("Samsung");

        Printable object3 = main.createObject("Xiaomi");

        Printable[] objects = {object1, object2, object3};

        for (Printable obj : objects) {
            obj.print();
        }
    }

    public Printable createObject(String className) {
        switch (className) {
            case "iPhone":
                return new iPhone("15 Pro", 2023, "iOS 18");
            case "Samsung":
                return new Samsung("Galaxy S21", 2021, "Android 11");
            case "Xiaomi":
                return new Xiaomi("Mi 11 Pro", 2021, "MIUI 12");
            default:
                return null;
        }
    }
}
