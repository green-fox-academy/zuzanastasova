package fleetOfThings;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        fleet.add(milk);

        Thing obstacles = new Thing("Remove the obstacles");
        fleet.add(obstacles);

        Thing standUp = new Thing("Stand up");
        fleet.add(standUp);
        standUp.complete();

        Thing eat= new Thing ("Eat lunch");
        fleet.add(eat);
        eat.complete();


        System.out.println(fleet);
    }
}
// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch
