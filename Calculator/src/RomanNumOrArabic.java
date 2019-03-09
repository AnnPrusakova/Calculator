
public class RomanNumOrArabic {


    public int valueNum1(String num1){
        int a;
        if(num1.matches("[-+]?\\d+")){
          a = Integer.parseInt(num1);
        }
        else{
             a = value(num1);
        }

        return a;
    }

    public int valueNum2(String num2){
        int b;
        if(num2.matches("[-+]?\\d+")){
            b = Integer.parseInt(num2);
        }
        else{
            b = value(num2);
        }
        return b;
    }

    public int value (String romanNum){
        if (romanNum.equals("I"))
            return 1;
        if (romanNum.equals("II"))
            return 2;
        if (romanNum.equals("III"))
            return 3;
        if (romanNum.equals("IV"))
            return 4;
        if (romanNum.equals("V"))
            return 5;
        if (romanNum.equals("VI"))
            return 6;
        if (romanNum.equals("VII"))
            return 7;
        if (romanNum.equals("VIII"))
            return 8;
        if (romanNum.equals("IX"))
            return 9;
        if (romanNum.equals("X"))
            return 10;
        System.out.println("The number is not correct");
        return 0;
    }
}
