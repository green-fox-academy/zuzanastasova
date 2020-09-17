package petrolStation;

public class Main {
    public static void main(String[] args) {

        PetrolStation myStation = new PetrolStation();
        Car myCar = new Car();

        System.out.println(myStation.refill(myCar));

        PetrolStation yourStation = new PetrolStation();
        Car yourCar = new Car();

        yourStation.gasAmount = 1000;
        yourCar.gasAmount = 30;

        System.out.println(yourStation.refill(yourCar));
    }
}
