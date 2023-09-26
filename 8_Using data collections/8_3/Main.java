//Managing resizable arrays with ArrayList

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Colombo");
        list.add("Galle");
        list.add("Karandeniya");

        System.out.println(list);

        list.add("Elpitiya");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The 2nd state is: "+state);

        int pos = list.indexOf("Elpitiya");
        System.out.println("Elpitiya is at position " + pos);


    }
}
