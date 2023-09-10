//Converting numeric values

public class Main {
    public static void main(String[] args){
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("Second value is: " + intValue2);

        long longValue1 = intValue1;
        System.out.println("long value is: " + longValue1);

        short shortValue1 = (short)intValue1;
        System.out.println("short value is: " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("byte value is: " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("double value to int: " + intValue4);


    }
}
