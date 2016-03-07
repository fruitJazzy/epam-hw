package javase02.t01;

import java.util.Objects;

/**
 * Created by jazzt on 06.03.16.
 */
public abstract class Pen {

    private static int id;

    private String tipType;

    private float tipLength;

    private float tipSize;

    private float weidth;

    private float lengthCapped;

    private float lengthUncapped;

    private String bodyColor;

    private String bodyMaterial;

    private boolean inkRefillable;

    private boolean colorSet;

    private float inkLevel;

    public Pen() {
        id++;
    }

    public Pen(float inkLevel) {
        id++;
        this.inkLevel = inkLevel;
    }

    public int getId() {
        return id;
    }

    public String getTipType() {
        return tipType;
    }

    public float getTipLength() {
        return tipLength;
    }

    public float getTipSize() {
        return tipSize;
    }


    public float getWeidth() {
        return weidth;
    }

    public float getLengthCapped() {
        return lengthCapped;
    }

    public float getLengthUncapped() {
        return lengthUncapped;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public boolean isInkRefillable() {
        return inkRefillable;
    }

    public boolean isColorSet() {
        return colorSet;
    }

    public float getInkLevel() {
        return inkLevel;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    public void setTipLength(float tipLength) {
        this.tipLength = tipLength;
    }

    public void setTipSize(float tipSize) {
        this.tipSize = tipSize;
    }


    public void setWeidth(float weidth) {
        this.weidth = weidth;
    }

    public void setLengthCapped(float lengthCapped) {
        this.lengthCapped = lengthCapped;
    }

    public void setLengthUncapped(float lengthUncapped) {
        this.lengthUncapped = lengthUncapped;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public void setInkRefillable(boolean inkRefillable) {
        this.inkRefillable = inkRefillable;
    }

    public void setColorSet(boolean colorSet) {
        this.colorSet = colorSet;
    }

    public void setInkLevel(float inkLevel) {
        this.inkLevel = inkLevel;
    }

    public abstract void write(String world);

    public abstract void write(String[] text);

    public abstract void draw(String figure);

    @Override
    public String toString() {
        return  "Pen: { \n" + "        id: " + getId() + ",\n" +
                "        tipType: " + getTipType() + ",\n" +
                "        tipLength: " + getTipLength() + ",\n" +
                "        weidth: " + getWeidth() + ",\n" +
                "        lengthUncapped: " + getLengthUncapped() + ",\n" +
                "        bodyColor: " + getBodyColor() + ",\n" +
                "        bodyMaterial: " + getBodyMaterial() + ",\n" +
                "        inkRefillable: " + isInkRefillable() + ",\n" +
                "        inkLevel: " + getInkLevel() + ",\n" +
                "        colorSet: " + isColorSet() + "\n" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Pen o = (Pen) obj;
        return this.getId() == o.getId()
                && this.inkLevel == o.inkLevel
                && this.tipType.equals(o.tipType)
                && this.tipLength == o.tipLength
                && this.tipSize == o.tipSize
                && this.weidth == o.weidth
                && this.lengthCapped == o.lengthCapped
                && this.lengthUncapped == o.lengthUncapped
                && this.bodyColor.equals(o.bodyColor)
                && this.bodyMaterial.equals(o.bodyMaterial)
                && this.inkRefillable == o.inkRefillable
                && this.colorSet == o.colorSet
                && this.inkLevel == o.inkLevel;

    }

    @Override
    public int hashCode() {
        return Objects.hash(tipType, tipLength, tipSize, weidth, lengthCapped, lengthUncapped, bodyColor, bodyMaterial, inkRefillable, colorSet, inkLevel);
    }

}
