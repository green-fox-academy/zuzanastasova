package Pirates;

import java.util.Random;

public class Pirate {

    private int rum;
    private boolean sleep;
    private boolean dead;
    private String parrot;
    private String pirate;
    private int crew;

    public Pirate(String pirate) {
        this.pirate = pirate;
        rum = 0;
        sleep = false;
        dead = false;
    }

    public void drinkSomeRum() {
        if (dead == true) {
            System.out.println("he's dead");
        }
       else {
            rum++;
        }
    }

    public void howsItGoingMate() {

        if (dead == true) {
            System.out.println("he's dead");
        }
        else if (rum <= 4) {
            System.out.println("Pour me anudder!");
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleep = true;
        }
    }

    public boolean die() {
        return dead = true;
    }

    public void brawl(){

    }

    public int getRum() {
        return rum;
    }

    public int setCrew () {
        int max = 50;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 50; i++) {
            crew = (int)(Math.random() * range) + min;
        }
       for (int i = 0; i < crew; i++) {
           if (dead) {
               crew--;
           }
       }
        return crew;
    }

    public int getCrew (){
        return setCrew();
    }

    public void setName (String pirate){
        this.pirate = pirate;
    }

    public String getName () {
        return pirate;
    }

    public boolean getDead() {
        return dead;
    }

    public boolean getSleep() {
        return sleep;
    }

    public void setParrot(String parrot) {
        this.parrot = parrot;
    }
}
    //brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
