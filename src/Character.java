// Персонаж та характеристики (ввід даних та їх повернення)

public class Character {
    private String name;
    private String type; // Воїн, Маг, Лучник
    private CharacterAttributes attributes;
    private int x, y; // Координати

    public Character(String name, String type, CharacterAttributes attributes) {
        this.name = name;
        this.type = type;
        this.attributes = attributes;
        this.x = 0;
        this.y = 0;
    }

    // Гетер для імені
    public String getName() {
        return name;
    }

    // Гетер для типу
    public String getType() {
        return type;
    }

    public void attack() {
        System.out.println(name + " (" + type + ") атакує з силою " + attributes.getAttackPower());
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Тип: " + type + ", Здоров'я: " + attributes.getHealth()
                + ", Атака: " + attributes.getAttackPower() + ", Координати: " + getCoordinates());
    }
}




