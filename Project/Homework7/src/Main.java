public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "SPELL CAST"),
                new Medic(80, 10, "HEALING", 30),
                new Warrior(120, 30, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Medic's new heal points: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}

package kg.geeks.game.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String name, int healPoints) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && hero != this && hero.getHealth() < 100) {
                hero.setHealth(hero.getHealth() + healPoints);
                System.out.println(this.getName() + " heals " + hero.getName() + " for " + healPoints + " points");
                break; // лечит только одного героя
            }
        }
    }
}

package kg.geeks.game.logic;

import kg.geeks.game.players.*;

        import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    private static int roundNumber = 0;

    public static void startGame() {
        Boss boss = new Boss(1200, 50, "Zeus");
        Warrior warrior1 = new Warrior(270, 20, "Hercules");
        Warrior warrior2 = new Warrior(280, 15, "Achilles");
        Magic magic = new Magic(260, 20, "Merlin");
        Berserk berserk = new Berserk(270, 15, "Guts");
        Medic medic = new Medic(250, 5, "Florence", 50); // Добавлен новый герой

        Hero[] heroes = {warrior1, warrior2, magic, berserk, medic};
        printStatistics(boss, heroes);
        while (!isGameOver(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static boolean isGameOver(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    private static void round(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence();
        boss.attack(heroes);
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && boss.getHealth() > 0
                    && hero.getAbility() != boss.getDefence()) {
                hero.attack(boss);
                hero.applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND " + roundNumber + " ----------------");
        System.out.println(boss);
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}

package kg.geeks.game.players;

public abstract class GameEntity {
    private int health;
    private int damage;
    private String name;

    public GameEntity(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " health: " + this.health + " damage: " + this.damage;
    }
}

package kg.geeks.game.players;

public interface HavingSuperAbility {
    void applySuperPower(Boss boss, Hero[] heroes);
}

package kg.geeks.game.players;

public enum SuperAbility {
    HEAL, BOOST, CRITICAL_DAMAGE, BLOCK_DAMAGE_AND_REVERT;
}

package kg.geeks.game.players;

import java.util.Random;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence() {
        SuperAbility[] abilities = SuperAbility.values();
        int randomIndex = RPG_Game.random.nextInt(abilities.length);
        this.defence = abilities[randomIndex];
    }

    public void attack(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setHealth(hero.getHealth() - this.getDamage());
            }
        }
    }
}

package kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        if (boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }
}

// Остальные классы (Warrior, Magic, Berserk) будут похожи на Medic, но с другими суперспособностями.
