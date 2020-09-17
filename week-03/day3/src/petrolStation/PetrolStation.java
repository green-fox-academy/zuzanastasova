package petrolStation;

public class PetrolStation {

    int gasAmount;

    public int refill (Car car){
        return gasAmount - car.capacity + car.gasAmount;
    }

}
