// declaring and initializing numeric primitives

public class Main{
    public static void main(String[] args) {
        byte b =1;
        short sh = 1;
        int i = 1;
        long l =1L;

        float f = 1f;
        double d = 1d;

        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);


        byte a = 127;
        System.out.println("\nByte: "+ a);
        a++;
        System.out.println("Byte: "+ a);
        //max value of byte is 127. therefore after increment by one, output -128

        byte c = 127;
        if(c<Byte.MAX_VALUE){
            c++;
        }
        System.out.println("\nByte: " + c);

    }
}