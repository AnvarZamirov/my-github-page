public class Xiaomi extends Phone implements Printable {
    private String miuiVersion;

    public Xiaomi(String model, int year, String miuiVersion) {
        super("Xiaomi", model, year);
        this.miuiVersion = miuiVersion;
    }

    public String getMiuiVersion() {
        return miuiVersion;
    }

    @Override
    public void print() {
        System.out.println("BrandName: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() +
                ", MIUI Version: " + miuiVersion + ", Serial Number#: " + getSerialNumber());
    }
}
