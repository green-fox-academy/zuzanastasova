package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    String sound;

    public ElectricGuitar () {
        super("Electric guitar", 6);
        sound = "Twang";
    }

    public ElectricGuitar (int numberOfStrings) {
        super("Electric guitar", numberOfStrings);
        sound = "Twang";
    }

    @Override
    public void sound() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    }
}
