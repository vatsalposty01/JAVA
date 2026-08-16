interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Status: The Light is now turned ON.");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Status: The Fan is now turned ON and spinning.");
    }
}

public class SwitchableDemo {
    public static void main(String[] args) {

        Switchable livingRoomLight = new Light();
        Switchable ceilingFan = new Fan();

        livingRoomLight.turnOn();
        ceilingFan.turnOn();
    }
}