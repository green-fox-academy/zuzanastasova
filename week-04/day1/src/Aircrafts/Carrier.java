package Aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    protected List<Aircraft> aircrafts;
    protected int storeOfAmmo;
    protected int ammo;
    protected int healthPoints;

    public Carrier() {
        aircrafts = new ArrayList<>();
        this.storeOfAmmo = 2300;
        this.healthPoints = 5000;
        this.ammo = 100;
    }

    public Carrier(int ammo, int healthPoints) {
        this.ammo = ammo;
        this.healthPoints =healthPoints;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() throws Exception {
        for (Aircraft aircraft : aircrafts) {
            aircraft.setAmmo(aircraft.maxAmmo);
            storeOfAmmo -= aircraft.maxAmmo - aircraft.getAmmo();
        }
        for (Aircraft aircraft : aircrafts) {
            if (storeOfAmmo < (aircraft.maxAmmo - aircraft.getAmmo())) {
                if (aircraft.isPriority()) {
                    aircraft.refill(storeOfAmmo);
                }
            }
        }
        for (Aircraft aircraft : aircrafts) {
            if (storeOfAmmo < (aircraft.maxAmmo - aircraft.getAmmo())) {
                if (!aircraft.isPriority()) {
                    aircraft.refill(storeOfAmmo);
                }
            }
        }
        if (storeOfAmmo == 0) {
            throw new Exception("There is no ammo!");
        }
    }

    public int getTotalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage += aircraft.maxAmmo * aircraft.damage;
        }
        return totalDamage;
    }

    public void fight(Carrier carrier) {
        healthPoints -= getTotalDamage();
    }
    public void getStatus() {
        System.out.println("HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + storeOfAmmo + ", Total damage: " + getTotalDamage() + "\n Aircrafts: \n");
        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.getStatus());
        }
    }
}
