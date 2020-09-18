package sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        SharpieSet mySharpies = new SharpieSet();

        sharpieSet.Sharpie greenie = new Sharpie("Greenie");
        mySharpies.add(greenie);
        greenie.setInkAmount(0f);

        sharpieSet.Sharpie blue = new Sharpie ("Blue");
        mySharpies.add(blue);

        sharpieSet.Sharpie rosie = new Sharpie("Rosie");
        mySharpies.add(rosie);
        rosie.setInkAmount(0f);

        sharpieSet.Sharpie yelly = new Sharpie("Yelly");
        mySharpies.add(yelly);
        yelly.setColor("Yellow");
        yelly.setInkAmount(50f);
        for (int i = 0; i < 4; i++) {
            yelly.use();
        }

        System.out.println(mySharpies.countUsable());
        mySharpies.removeTrash();
        mySharpies.printSharpies();

    }
}
