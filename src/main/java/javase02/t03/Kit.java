package javase02.t03;

import javase02.t03.handwritten_arcticles.pen.Pen;



/**
 * 2 ручки
 * карандаш
 * ножницы
 * степлер
 * линейка
 * ластик
 * скрепка
 *
 * class Stationery
 ..handwritten_device
 ..pen
 ..pencil
 ..marker
 ..mechanic_device
 ..scissors
 ..stapler
 ..measuring_device
 ..metric_ruler
 ..imperial_ruler
 */
public class Kit {

    private final int COUNT_PENS = 2;
    private Pen[] pens;

    public Kit() {
        for (int i = 0; i < COUNT_PENS; i++) {
            pens[i] = new Pen();
        }

    }

//    private Sciccors sciccors;
//
//    private Pencil pencil;
//
//    private Scissors scissors;
//
//    private Eraser eraser;
//
//    private Clip[] clips;

}
