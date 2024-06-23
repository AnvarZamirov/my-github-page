public class Father extends Grandfather {
    private ComplexType complexField;
    private ComplexEnum enumField;

    public Father(int age, String name, ComplexType complexField, ComplexEnum enumField) {
        super(age, name);
        this.complexField = complexField;
        this.enumField = enumField;
    }

    public ComplexType getComplexField() {
        return complexField;
    }

    public ComplexEnum getEnumField() {
        return enumField;
    }

    public void displayInfo() {
        System.out.println("Age: " + getAge() + ", Name: " + getName());
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "Age: " + getAge() + ", Name: " + getName());
    }


    public final void displayFullInfo() {
        System.out.println("Age: " + getAge() + ", Name: " + getName() +
                ", ComplexField: " + complexField.getDescription() + ", EnumField: " + enumField);
    }
}
