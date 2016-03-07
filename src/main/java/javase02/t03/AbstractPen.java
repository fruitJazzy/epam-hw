package javase02.t03;

/**
 * Created by jazzt on 07.03.16.
 */
public abstract class AbstractPen extends KancTovari{

    static int id;

    private String model;

    public AbstractPen() {
        super();
        id++;
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

}
