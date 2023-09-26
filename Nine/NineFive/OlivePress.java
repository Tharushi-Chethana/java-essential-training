package Nine.NineFive;

import java.util.List;

import Nine.NineFive.Model.Olive;

public class OlivePress {
    public int getOil(List<Olive> olives){
        for(Olive o : olives){
            System.out.println(o.name);
        }
        return 0;
    }
}
