package main.java.music;

public class BassGuitar extends StringedInstrument {

    String sound;

    public BassGuitar () {
        super("Bass guitar", 4);
        sound = "Duum-duum-duum";
    }
    public BassGuitar(int numberOfStrings) {
        super("Bass guitar", numberOfStrings);
        sound = "Duum-duum-duum";
    }

    @Override
    public void sound() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    }
}
