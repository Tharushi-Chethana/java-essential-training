// creating reusable code with methods

public class Main {

    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args){
        loopIt("Months of the year");
    }

    static void loopIt(String label){
        System.out.println(label);
        for(int i=0; i<months.length; i++){
            System.out.println(months[i]);
        }        
    }
}
