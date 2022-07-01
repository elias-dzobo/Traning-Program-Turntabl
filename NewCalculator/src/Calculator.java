public class Calculator {
    public static void main(String[] args) {

//        calculate(10, '/', 5);
//        //Tests
//        calculate(14, '+', 3);
//        calculate(10, '-', 7);
//        calculate(3, '*', 4);
//        calculate(10, '-', 15);
//        calculate(10, '/', 25);
//        calculate(3, '/', 2);

        //System.out.println(10.0 / 15.0);
    }

    public static int calculate(int firstNum, char operand, int secondNum) {
        int res;
        switch (operand) {
            case '+':
                res = firstNum + secondNum;
                break;
            case '-':
                res = firstNum - secondNum;
                break;
            case '*':
                res = firstNum * secondNum;
                break;
            case '/':
                res = firstNum / secondNum;
                break;
            default:
                res = 0;
                break;
        }

        return res;
    }
}
