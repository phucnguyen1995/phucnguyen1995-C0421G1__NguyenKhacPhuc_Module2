package _08_clean_code_refactoring.thuchanh;

//public class Calculator {
//    public static int calculate(int a, int b, char o) {
//        switch (o) {
//            case '+':
//                return a + b;
//            case '-':
//                return a - b;
//            case '*':
//                return a * b;
//            case '/':
//                if (b != 0)
//                    return a / b;
//                else
//                    throw new RuntimeException("Can not divide by 0");
//            default:
//                throw new RuntimeException("Unsupported operation");
//        }
//    }

//    public static int calculate(int firstOperand, int secondOperand, char operator) {
//        switch (operator) {
//            case '+':
//                return firstOperand + secondOperand;
//            case '-':
//                return firstOperand - secondOperand;
//            case '*':
//                return firstOperand * secondOperand;
//            case '/':
//                if (secondOperand != 0)
//                    return firstOperand / secondOperand;
//                else
//                    throw new RuntimeException("Can not divide by 0");
//                                              Không thể chia cho 0
//            default:
//                throw new RuntimeException("Unsupported operation");
//                                            Hoạt động không được hỗ trợ
//        }
//
//    }
//}

//    Biến a: firstOperand - toán hạng đầu tiên
//        Biến b: secondOperand - toán hạng thứ hai
//        Biến o: operator - toán tử

//
//public static final char ADDITION = '+';
//public static final char SUBTRACTION = '-';
//public static final char MULTIPLICATION = '*';
//public static final char DIVISION = '/';

public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
        case ADDITION:
        return firstOperand + secondOperand;
        case SUBTRACTION:
        return firstOperand - secondOperand;
        case MULTIPLICATION:
        return firstOperand * secondOperand;
        case DIVISION:
        if (secondOperand != 0)
        return firstOperand / secondOperand;
        else
        throw new RuntimeException("Can not divide by 0");
default:
        throw new RuntimeException("Unsupported operation");
        }
        }
