
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        RomanNumOrArabic RomOrArab = new RomanNumOrArabic();
        Calculator calclate = new Calculator();
        System.out.println("Please, enter two numbers: ");
        String num1 = s.next();
        String num2 = s.next();

        int a = RomOrArab.valueNum1(num1);
        int b = RomOrArab.valueNum1(num2);

        System.out.println("Please, choose the operation. Enter '+', '-', '*', '/'");
        String value = s.next();
        int result =  calclate.calculate(a,b,value);
        System.out.println(a +" " + value + " " + b + " = " + result);





    }
}
