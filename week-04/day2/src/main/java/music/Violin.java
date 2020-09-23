package main.java.music;

public class Violin extends StringedInstrument {

    String sound;

    public Violin () {
        super("Violin", 4);
        sound = "Screech";
    }
    public Violin (int numberOfStrings) {
        super("Violin", 4);
        sound = "Screech";
    }

    public void sound() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    }
}
