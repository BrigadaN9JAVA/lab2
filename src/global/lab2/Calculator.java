package global.lab2;
import java.lang.Math;

class Calculator {

    private static double task25(double a, double b, double c, double d) {
        return (Math.pow(a, b) / Math.cosh(Math.abs(b))) + ((4 * Math.log10(c)) / Math.pow(d, 0.2));
    }

    private static double task26(double a, double b, double c, double d) {
        return (Math.pow(Math.tan(a), 1/c)) / (2 - (Math.cosh(b) / (Math.log((Math.abs(d + c))))));
    }

    private static double task27(double a, double b, double c, double d) {
        return Math.sin(Math.pow(a, -b)) + 3 * Math.abs(Math.acos(-Math.sqrt(c/d)));
    }

     /*Last 3 function was wrote to protect calculating function, so engineer, which not
     belong to this part of project won`t see them and its won`t divert!!!*/

    public static void printResultT25(double a, double b, double c, double d){
        System.out.println("> Result of task25: y = " + task25(a, b, c ,d));
    }

    public static void printResultT26(double a, double b, double c, double d){
        System.out.println("> Result of task26: y = " + task26(a, b, c ,d));
    }

    public static void printResultT27(double a, double b, double c, double d){
        System.out.println("> Result of task27: y = " + task27(a, b, c ,d));
    }

}
