package javase01.t03;

/**
 * Created by jazzt on 27.02.16.
 */
public  class ValueOfFun {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double h = Double.parseDouble(args[2]);

        valueOfFun(a,b,h);
    }

    public static void valueOfFun(double start, double end, double h) {
        for (double i = start; i <= end; i+=h) {
            System.out.printf("x %.2f f(x) %.10f %n", i,fun(i));
        }
    }

    public static  double fun(double x) {
        return Math.tan(2 * x) - 3;
    }
}
