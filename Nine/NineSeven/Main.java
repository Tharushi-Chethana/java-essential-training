package Nine.NineSeven;

import java.util.ArrayList;
import java.util.List;

import Nine.NineSeven.model.Olive;
import Nine.NineSeven.model.OliveName;

public class Main {
    public static void main(String[] args){
        List<Olive> olives = new ArrayList<>();
        Olive Olive1 = new Olive(OliveName.THARUSHI, 932314, 8);
        olives.add(Olive1);
        Olive Olive2 = new Olive(OliveName.THARUSHI, 932314, 8);
        Olive2.setOil(1);
        olives.add(Olive2);
        Olive Olive3 = new Olive(OliveName.THARUSHI, 932314, 8);
        Olive3.setOil(4);
        olives.add(Olive3);

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }
}
