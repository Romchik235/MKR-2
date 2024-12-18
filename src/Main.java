import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arena arena = new Arena();

        // Додаємо спостерігача
        EventListener observer = new EventListener("Головний спостерігач");
        arena.addObserver(observer);

        // Користувач обирає персонажів
        System.out.println("Вітаємо у грі! Виберіть тип персонажа для додавання (воїн, маг, лучник).");
        System.out.println("Введіть 'стоп', щоб завершити додавання персонажів.");

        while (true) {
            System.out.print("\nВведіть тип персонажа: ");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("стоп")) break;

            System.out.print("Введіть ім'я персонажа: ");
            String name = scanner.nextLine();

            try {
                Character character = CharacterFactory.createCharacter(type, name);
                arena.addCharacter(character);

                System.out.print("Введіть координати x: ");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.print("Введіть координати y: ");
                int y = Integer.parseInt(scanner.nextLine());
                arena.moveCharacter(character, x, y);
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }

        // Показати усіх персонажів
        arena.displayAllCharacters();

        // Атака всіх персонажів
        System.out.println("\nВсі персонажі починають атаку:");
        arena.attackAll();

        scanner.close();
    }
}


