import java.util.UUID;

public class Phone {
    private String brand;
    private String model;
    private int year;
    private String serialNumber;

    public Phone(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = generateSerialNumber();
    }

    private String generateSerialNumber() {
        return UUID.randomUUID().toString();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
