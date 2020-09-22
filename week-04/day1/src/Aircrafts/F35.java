package Aircrafts;

public class F35 extends Aircraft {

    F35() {
        super(12, 50, AircraftType.F35);
    }

    public boolean isPriority(){
        return true;
    }
}
