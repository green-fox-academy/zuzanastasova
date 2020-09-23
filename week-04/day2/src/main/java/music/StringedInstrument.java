package main.java.music;

public class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }


    public void sound(String sound) {
        super.play();
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    }
}
