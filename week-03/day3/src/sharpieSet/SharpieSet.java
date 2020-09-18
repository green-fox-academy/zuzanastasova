package sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List <Sharpie> sharpieList;

    public SharpieSet () {
        sharpieList = new ArrayList<>();
    }

    public void add (Sharpie sharpie) {
        sharpieList.add(sharpie);
    }

    public int countUsable (){
        int counter = 0;
        for (Sharpie sharps : sharpieList) {
            if (sharps.getInkAmount() != 0f) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash () {
        sharpieList.removeIf(sharps -> sharps.getInkAmount() == 0f);
    }

    public void printSharpies (){
        for (Sharpie sharps: sharpieList) {
            System.out.println(sharps.getColor() + ", " + sharps.getWidth() + ", " + sharps.getInkAmount());
        }
    }
}
