package Nine.NineSeven;

import Nine.NineSeven.model.Olive;
import java.util.List;

public class OlivePress {
    public int getOil(List<Olive> olives){
        int totalOil = 0;
        for(Olive o : olives){
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }
}
