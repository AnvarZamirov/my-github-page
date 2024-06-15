public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем ему свойства
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");

        // Распечатываем информацию о боссе
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence type: " + boss.getDefenceType());

        // Создаем героев и печатаем информацию о них
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth() +
                    ", damage: " + hero.getDamage() +
                    ", super ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 30, "Invisibility");
        Hero hero2 = new Hero(200, 20); // superAbility будет "None"
        Hero hero3 = new Hero(300, 40, "Healing");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
