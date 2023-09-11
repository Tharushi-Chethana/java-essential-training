// programming conditional logic

public class Main{
    public static void main(String[] args){
        int monthNumber = 8;

        if(monthNumber >= 1 && monthNumber<=3){
            System.out.println("Between 1 and 3");
        }
        else if(monthNumber >= 4 && monthNumber<=6) {
            System.out.println("Between 4 and 6");
        }
        else if(monthNumber >= 7 && monthNumber<=9) {
            System.out.println("Between 7 and 9");
        }
        else if(monthNumber >= 10 && monthNumber<=12) {
            System.out.println("Between 10 and 12");
        }
        else{
            System.out.println("More than 12");
        }
    }
}