public final class Son extends Father {
    private String hobby;

    public Son(int age, String name, ComplexType complexField, ComplexEnum enumField, String hobby) {
        super(age, name, complexField, enumField);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }


    @Override
    public void displayInfo() {
        System.out.println("Age: " + getAge() + ", Name: " + getName() + ", Hobby: " + hobby);
    }
}
