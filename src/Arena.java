// Mediator

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character.getName() + " (" + character.getType() + ") доданий на арену.");
    }

    public void moveCharacter(Character character, int x, int y) {
        character.setCoordinates(x, y);
        notifyObservers(character.getName() + " переміщено на координати " + character.getCoordinates());
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void attackAll() {
        for (Character character : characters) {
            character.attack();
        }
    }

    public void displayAllCharacters() {
        System.out.println("\nПоточні персонажі на арені:");
        for (Character character : characters) {
            character.displayInfo();
        }
    }
}



