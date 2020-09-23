package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar () {
        super("Electric guitar", 6);
        super.sound("Twang");
    }

    public ElectricGuitar (int numberOfStrings) {
        super("Electric guitar", numberOfStrings);
        super.sound("Twang");
    }

}
