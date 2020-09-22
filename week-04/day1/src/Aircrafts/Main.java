package Aircrafts;

public class Main {
    public static void main(String[] args) throws Exception {

        Carrier carrier = new Carrier();

        Aircraft F16_1 = new F16();
        Aircraft F16_2 = new F16();
        Aircraft F35_1 = new F35();
        Aircraft F35_2 = new F35();
        Aircraft F35_3 = new F35();

        carrier.addAircraft(F16_1);
        carrier.addAircraft(F16_2);
        carrier.addAircraft(F35_1);
        carrier.addAircraft(F35_2);
        carrier.addAircraft(F35_3);

        carrier.fill();
        carrier.getStatus();
    }
}