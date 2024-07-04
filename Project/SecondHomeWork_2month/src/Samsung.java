public class Samsung extends Phone implements Printable {
    private String androidVersion;

    public Samsung(String model, int year, String androidVersion) {
        super("Samsung", model, year);
        this.androidVersion = androidVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    @Override
    public void print() {
        System.out.println("BrandName: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() +
                ", Android Version: " + androidVersion + ", Serial Number#: " + getSerialNumber());
    }
}
