package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ship {

    private String shipName;
    int aliveCrew;

    private List<Pirate> shipOfPirates;

    public Ship() {
        shipOfPirates = new ArrayList<>();
        aliveCrew = 0;
    }

    public void fillShip (String shipName, Pirate pirate){
        this.shipName = shipName;
        shipOfPirates.add(pirate);
        this.aliveCrew = pirate.getCrew();
    }

    public void shipStatus() {
        for (Pirate pirate : shipOfPirates) {
            if (pirate.getDead()) {
                System.out.println(shipName + " has on the board Captain " + pirate.getName() + " who drunk " + pirate.getRum() + " rums and died. On the board are " + pirate.getCrew() + " living pirates as well.");
            } else if (pirate.getSleep()) {
                System.out.println(shipName + " has on the board Captain " + pirate.getName() + "  who drunk " + pirate.getRum() + " rums and passed out. On the board are " + pirate.getCrew() + " living pirates as well.");
            } else if (pirate.getRum() == 1) {
                System.out.println(shipName + " has on the board Captain " + pirate.getName() + "  who drunk " + pirate.getRum() + " rum and is sober. On the board are " + pirate.getCrew() + " living pirates as well.");
            } else if (pirate.getRum() == 0) {
                System.out.println(shipName + " has on the board Captain " + pirate.getName() + "  who didn't drink rum and is sober. On the board are " + pirate.getCrew() + " living pirates as well.");
            } else {
                System.out.println(shipName + " has on the board Captain " + pirate.getName() + " who drunk " + pirate.getRum() + " rums and is barely drunk. On the board are " + pirate.getCrew() + " living pirates as well.");
            }
        }
    }
    public boolean battle(Ship otherShip){
        Random random = new Random();
        //battle winner
        if ((this.aliveCrew - this.shipOfPirates.get(0).getRum()) > (otherShip.aliveCrew - otherShip.shipOfPirates.get(0).getRum())) {

            System.out.println("This ship won!");

            //deaths wins this ship
            for (Pirate pirate : otherShip.shipOfPirates) {
                for (int death = 0; death < random.nextInt(otherShip.aliveCrew); death++) {
                    pirate.die();
                    otherShip.aliveCrew--;
                }
            }

            //party wins this ship
            for (Pirate pirate : this.shipOfPirates) {
                for (int rum = 0; rum < random.nextInt(15); rum++) {
                    pirate.drinkSomeRum();
                    rum++;
                }
            }

            return true;
        }
        else {
            System.out.println("This ship lost!");
            //deaths, when other Ship wins
            for (Pirate pirate : this.shipOfPirates) {
                for (int death = 0; death < random.nextInt(this.aliveCrew); death++) {
                    pirate.die();
                    this.aliveCrew--;
                }
            }
            //party,when other Ship wins
            for (Pirate pirate : otherShip.shipOfPirates) {
                for (int rum = 0; rum < random.nextInt(15); rum++) {
                    pirate.drinkSomeRum();
                    rum++;
                }
            }
        return false;
        }
    }

    public void shipInfo () {
        for (Pirate pirate : shipOfPirates) {
            System.out.println(shipName + ", " + pirate.getName() + ", " + aliveCrew + ", " + pirate.getRum());
        }

    }

}
