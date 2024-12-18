// Фабричний метод

import java.util.Scanner;

public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        Scanner scanner = new Scanner(System.in);
        int health, attackPower;

        System.out.println("Введіть рівень здоров'я для персонажа " + name + ": ");
        health = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть потужність атаки для персонажа " + name + ": ");
        attackPower = Integer.parseInt(scanner.nextLine());

        CharacterAttributes attributes = new CharacterAttributes(health, attackPower);
        return new Character(name, type, attributes);
    }
}



