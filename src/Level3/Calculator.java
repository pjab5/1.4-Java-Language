package Level3;

public class Calculator {
     public static double addition(double a, double b){
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
         if(b==0){
             throw new ArithmeticException("You can not divide by 0.");
         }
        return a/b;
    }

    public static double logarithm(double a){
        if(a<=0){
            throw new ArithmeticException("Logarithms are simply not defined for zero or negative numbers.");
        }
        return Math.log(a);
    }
}
