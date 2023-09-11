// Creating looping code blocks

public class Main {
    public static void main(String[] args){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int i=0; i<months.length; i++){
            System.out.println(months[i]);
        }
        System.out.println();

        for(String month: months){
            System.out.println(month);
        }
        System.out.println();

        int counter = 0;
        while(counter < months.length){
            System.out.println(months[counter]);
            counter++;
        }

        System.out.println();
        do{
            System.out.println(months[counter]);
            counter++;
        }while(counter < months.length);
        
    }

}
