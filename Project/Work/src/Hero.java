public class Hero {
    private int health;
    private int damage;
    private String superAbility;

    // Конструктор, задающий все поля
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }


    // Конструктор, задающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superAbility = "None"; // По умолчанию, если суперспособность не указана
    }

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
