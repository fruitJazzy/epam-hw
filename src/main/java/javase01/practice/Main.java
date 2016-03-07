package javase01.practice;

import java.util.Comparator;

/**
 * Created by jazzt on 03.03.16.
 */

@ImportCallMe(value = "whatever")
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
//        System.out.println(
//                m3(
//                        Math::max
//        ));
//
//        Method m3= Main.class.getMethod("m3", Sortable.class);
//        Method m4= Main.class.getMethod("m4", Sortable.class);
//
//        ImportCallMe c = m3.getDeclaredAnnotation(ImportCallMe.class);
//        ImportCallMe c2 = m4.getDeclaredAnnotation(ImportCallMe.class);
//        ImportCallMe c3 = Main.class.getDeclaredAnnotation(ImportCallMe.class);
//
//        System.out.println(c);
//        System.out.println(c2);
//        System.out.println(c3);

        Comparator comparator = (o1, o2) -> 0;
        Comparable comparable = o -> 0;

    }

    @ImportCallMe
    public static int m3(Sortable sortable) {
        return  sortable.m1(3,10) + sortable.m1(3,5);
    }

    @ImportCallMe("No")
    public static int m4(Sortable sortable) {
        return  sortable.m1(3,10) + sortable.m1(3,5);
    }
}
