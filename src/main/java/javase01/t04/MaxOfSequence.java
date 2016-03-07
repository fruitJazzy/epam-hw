package javase01.t04;

/**
 * Created by jazzt on 27.02.16.
 */
public class MaxOfSequence {
    public static void main(String[] args) {
        double[] sequence = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            sequence[i] = Double.parseDouble(args[i]);
        }


        System.out.printf("%.4f %n", maxPair(sequence));

        for (double a : sequence) {
            System.out.printf("%.3f %n", a);
        }
    }

    public static double maxPair(double[] array) {
        double max = array[0] + array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (max < (array[i] + array[array.length - i - 1]))
                max = (array[i] + array[array.length - i - 1]);
        }
        return max;
    }
}
