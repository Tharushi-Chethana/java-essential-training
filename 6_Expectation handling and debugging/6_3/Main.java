// Handling exceptions with try/catch

public class Main {
    public static void main(String[] args){
        
        String welcome = "Welcome";
        char[] chars = welcome.toCharArray();

        try{
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            // System.out.println(e);
        }
    }
}
