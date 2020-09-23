package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar () {
        super("Bass guitar", 4);
        super.sound("Duum-duum-duum");
    }
    public BassGuitar(int numberOfStrings) {
        super("Bass guitar", numberOfStrings);
        super.sound("Duum-duum-duum");
    }

}
