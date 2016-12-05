package sample;
public class Model {
        
    public double Calculate(double number1, double number2, String operator) {
        switch(operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                
                if(number2==0)return 0;
                return number1 / number2;
        }
//        System.out.println("Unknown operator - "+operator);
        return 0;
    }
    public double Calculate2(double number1, String calc){
        switch(calc) {
            case "x^2":
                return (double) Math.pow(number1,2);
            case "root":
                return Math.sqrt(number1);
            case "sin":
                return Math.sin(Math.PI*number1/180);
            case "cos":
                return  Math.cos(Math.PI*number1/180);
        }
        return 0;
    }
}
