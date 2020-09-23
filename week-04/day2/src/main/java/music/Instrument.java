package main.java.music;

public abstract class Instrument {

    protected String name;
    private String sound;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();
}
