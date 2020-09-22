package Aircrafts;

public class Aircraft {

    protected int ammo;
    protected int maxAmmo;
    protected int damage;
    protected AircraftType aircraftType;

    public Aircraft (){
        ammo = 0;
    }

    public Aircraft(int maxAmmo, int damage, AircraftType aircraftType) {
        this.maxAmmo = maxAmmo;
        this. damage = damage;
        this.aircraftType = aircraftType;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public int fight() {
        int totalDamage = maxAmmo * damage;
        setAmmo(0);
        return totalDamage;
    }

    public int refill(int storeOfAmmo) {
        if (storeOfAmmo > maxAmmo)
            for (int i = 0; i < (maxAmmo - ammo); i++) {
                storeOfAmmo -= maxAmmo;
            }
        else {
            for (int i = 0; i < storeOfAmmo; i++) {
                storeOfAmmo--;
            }
        }
        return storeOfAmmo;
    }

    public String getType(){
        return aircraftType.toString();
    }

    public String getStatus() {
        return "Type" + getType() + ", Ammo: " + maxAmmo + ", Base Damage: " + damage + ", All Damage: " + fight();
    }

    public boolean isPriority() {
            return true;
    }
}
