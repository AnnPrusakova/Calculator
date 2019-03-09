public class Calculator {

public int calculate(int a, int b, String operator){
int result = 0;
    switch (operator){
        case "+":
            result = a + b;
            break;
        case "-":
            result = a - b;
            break;
        case "*":
            result = a * b;
            break;
        case "/":
            result = a / b;
            break;
        default:
            System.out.println("Not correct type");
            return 0;
    }
    return result;
}

}


