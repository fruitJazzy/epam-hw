package javase01.t02.loop;

public class MinElement {
    public static void main(String[] args) {
        double e = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        minElem(e, n);
    }

    public static void minElem(double e, int n) {
        int min = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (fun(i) < e && count == 0) {
                min = i;
                count++;
            }
            System.out.println("i " + i + " f(i) " + fun(i));
        }
        System.out.println("min " + min);
    }

    public static double fun(int index) {
        return (double) 1 / Math.pow((index + 1), 2);
    }
}
