// Дані для спостерігача на арені

public class EventListener implements Observer {
    private String name;

    public EventListener(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Спостерігач " + name + ": " + event);
    }
}




