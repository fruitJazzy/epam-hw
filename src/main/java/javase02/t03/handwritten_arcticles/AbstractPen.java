package javase02.t03.handwritten_arcticles;

import javase02.t03.KancTovari;

/**
 * Created by jazzt on 07.03.16.
 */
public abstract class AbstractPen extends KancTovari {

    private String model;

    private float price;

    public AbstractPen() {
        super();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void write(String word);

    public abstract void write(String[] word);

    public abstract void draw(String figure);

    public abstract void setPrice(float price);

    public abstract float getPrice();

}
