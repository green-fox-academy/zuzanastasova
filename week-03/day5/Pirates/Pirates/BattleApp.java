package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship dragon = new Ship();

        Pirate oneEye = new Pirate("One Eye");

        dragon.fillShip("Dragon", oneEye);

        for (int rum = 0; rum < 3; rum++) {
            oneEye.drinkSomeRum();
        }
        oneEye.howsItGoingMate();

        dragon.shipStatus();

        Ship goldenPearl = new Ship();

        Pirate jackSparrow = new Pirate("Jack Sparrow");

        goldenPearl.fillShip("Golden Pearl", jackSparrow);

        for (int rum = 0; rum < 9; rum++) {
            jackSparrow.drinkSomeRum();
        }
        jackSparrow.howsItGoingMate();

        goldenPearl.shipStatus();

        goldenPearl.shipInfo();
        dragon.shipInfo();

        goldenPearl.battle(dragon);

        goldenPearl.shipInfo();
        dragon.shipInfo();
    }
}
