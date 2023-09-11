// Overloading methods with different signatures

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 2: ");

        double result1 = addValue(s1, s2);
        System.out.println("The answer is: "+ result1);
        double result2 = addValue(s1, s2, s3);
        System.out.println("The answer is: "+ result2);
        double result3 = addValue(s1, s2, s3, s1, s2, s3);
        System.out.println("The answer is: "+ result3);
    }

        static String getInput(String prompt){
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);

            return sc.nextLine();
        }

        static double addValue(String s1, String s2){
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            double result = d1 + d2;
            return result;
        }

        static double addValue(String s1, String s2, String s3){
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            double d3 = Double.parseDouble(s3);
            double result = d1 + d2 + d3;
            return result;
        }

        static double addValue(String ... values){
            double result=0;
            for(String value: values){
                double d = Double.parseDouble(value);
                result += d;
            }
            return result;
        }        
        
}
