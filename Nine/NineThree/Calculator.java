package Nine.NineThree;

import java.util.Scanner;

import Nine.NineTwo.utilities.MathHelper;

public class Calculator {

    public static void main(String[] args){
        
        Calculator calc = new Calculator();
        calc.calculate();

    }

    protected void calculate(){
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter number: ");
        String s2 = helper.getInput("Enter number: ");
        String op = helper.getInput("choose (+ - * /): ");

        double result = 0;
        
        try{
            switch (op){
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.substractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;  
                default:
                    System.out.println("unrecognized operation");
                    return;

            }
            System.out.println("Answer: "+result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    class InputHelper {
        private String getInput(String prompt){
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }

}
