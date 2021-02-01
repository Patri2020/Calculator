import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Let's calculate! Let's select the first number.");
        Scanner keyboard1 = new Scanner(System.in);
        int addNumber1 = keyboard1.nextInt();

        System.out.println("okay, we will add that number to a new number, choose another number.");
        Scanner keyboard2 = new Scanner(System.in);
        int addNumber2 = keyboard2.nextInt();

        int add = addNumber1+addNumber2;

        System.out.println("Okay, "+addNumber1+" plus "+addNumber2+" equals "+add);

        System.out.println("Let's continue! Let's select another number.");
        Scanner keyboard3 = new Scanner(System.in);
        int subtractNumber3 = keyboard3.nextInt();

        System.out.println("now, we will subtract that number with a new number, choose a new number.");
        Scanner keyboard4 = new Scanner(System.in);
        int subtractNumber4 = keyboard4.nextInt();

        int subtract = subtractNumber3-subtractNumber4;

        System.out.println("Okay, "+subtractNumber3+" minus "+subtractNumber4+" equals "+subtract);

        System.out.println("Let's multiply now! Select a number.");
        Scanner keyboard5 = new Scanner(System.in);
        int productNumber5 = keyboard5.nextInt();

        System.out.println("now, choose a new number to multiply against the prior number.");
        Scanner keyboard6 = new Scanner(System.in);
        int productNumber6 = keyboard6.nextInt();

        int product = productNumber5*productNumber6;

        System.out.println("Okay, "+productNumber5+" times "+productNumber6+" equals "+product);

        System.out.println("Time to divide now! Select a number.");
        Scanner keyboard7 = new Scanner(System.in);
        int divideNumber7 = keyboard7.nextInt();

        System.out.println("now, choose a new number to divide against the prior number.");
        Scanner keyboard8 = new Scanner(System.in);
        int divideNumber8 = keyboard8.nextInt();

        int divide = divideNumber7/divideNumber8;

        System.out.println("Okay, "+divideNumber7+" divided by "+divideNumber8+" equals "+divide);

        System.out.println("Time to make it interesting now! Select a number.");
        Scanner keyboard9 = new Scanner(System.in);
        int powerNumber9 = keyboard9.nextInt();

        System.out.println("now, we will square that number by a new number.");
        Scanner keyboard10 = new Scanner(System.in);
        int powerNumber10 = keyboard10.nextInt();

        int basenumber = powerNumber9, exponent = powerNumber10;
        double pow = Math.pow(powerNumber9, powerNumber10);

        System.out.println("Okay now, "+powerNumber9+" to the power of "+powerNumber10+" equals "+pow);

    }
}
