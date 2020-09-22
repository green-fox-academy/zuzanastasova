package Aircrafts;

public class F16 extends Aircraft {
    public F16() {
        super(8, 30, AircraftType.F16);
    }

    public boolean isPriority(){
        return false;
    }
}
