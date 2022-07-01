package Persona;

import java.util.Scanner;

public class NewCalculator {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int firstNum = myObj.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = myObj.nextInt();
        System.out.println("Enter operation, valid operations are [+, -, /, *]");
        char operand = myObj.next().charAt(0);

        calculate(firstNum, operand, secondNum);
    }

    public static void calculate(float firstNum, char operand, float secondNum) {
        switch (operand) {
            case '+':
                System.out.println(firstNum + secondNum);
                break;
            case '-':
                System.out.println(firstNum - secondNum);
                break;
            case '*':
                System.out.println(firstNum * secondNum);
                break;
            case '/':
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

}
