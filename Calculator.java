import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static double Calculations(double num1,double num2,String operation){
        switch (operation) {
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                if(num2==0){
                    System.out.println("Cannot divided by Zero ");
                    return 0.0;
                }
                else{
                return num1/num2;
                }
            default:
                System.out.println("Invalid Entry");
                return 0;
        }
    }
    public static double TrigonometryCalculation(double num1,String operation){
        double radians=num1*Math.PI/180;
        switch (operation) {
            case "sin":
                return Math.sin(radians);
            case "cos":
                return Math.cos(radians);
            case "tan":
                return Math.tan(radians);
            default:
                System.out.println("Invalid Entry");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
        System.out.println("Enter First Number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2=sc.nextDouble();
        System.out.println("Enter Any Operation(+,-,*,/,sin,cos,tan): ");
        String operation = sc.next();
        double result;
        if(operation.equals("sin")||operation.equals("cos")||operation.equals("tan")){
            result=TrigonometryCalculation(num1,operation);
        }
        else{
            result=Calculations(num1,num2,operation);
        }
        System.out.println("Result: "+result);
        System.out.println("Do you want to perform another Calculation(Y/N): ");
        String Response=sc.next();
        if(!Response.equalsIgnoreCase("Y")){
            break;
        }
    }
    sc.close();
    }
}
