public class iPhone extends Phone implements Printable {
    private String iosVersion;

    public iPhone(String model, int year, String iosVersion) {
        super("iPhone", model, year);
        this.iosVersion = iosVersion;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    @Override
    public void print() {
        System.out.println("BrandName: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() +
                ", iOS Version: " + iosVersion + ", Serial Number#: " + getSerialNumber());
    }
}
