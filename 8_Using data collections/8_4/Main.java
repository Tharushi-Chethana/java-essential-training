import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("Colombo", "Galle");
        map.put("Tharushi", "Chethana");
        map.put("Sanduni", "Menaka");
        System.out.println(map);

        map.put("Rangika", "Dedunu");
        System.out.println(map);

        String cap = map.get("Tharushi");
        System.out.println("The capital of orgen is: "+cap);
        

    }
}
