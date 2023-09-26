package Nine.NineFive;
import Nine.NineFive.Model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Olive> olives = new ArrayList<>();
        Olive Olive1 = new Olive();
        olives.add(Olive1);
        Olive Olive2 = new Olive();
        olives.add(Olive2);
        Olive Olive3 = new Olive();
        olives.add(Olive3);

        OlivePress press = new OlivePress();
        press.getOil(olives);

    }
}
